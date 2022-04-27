const path=require('path');
const http=require('http');
const express=require('express');
const socketio=require('socket.io');
const formatMessages=require('./utils/messages');
const {joinRoom, getCurrentUser, leaveRoom, getRoomUsers}=require('./utils/users');

const app=express();
const server=http.createServer(app);
const io=socketio(server);
const botName='MspaceChat';

app.use(express.static(path.join(__dirname, 'web')));


//when a client connects
io.on('connection', socket=>{
  socket.on('joinRoom', ({username, room})=>{
const user=joinRoom(socket.id,username, room);
socket.join(user.room);


    //welcome Current User
    socket.emit('message',formatMessages(botName,'Welcome to MSpace Chat'));

    //broadcast to all that a user has joined....sends to all other apart from the user who has just joined.
    socket.broadcast.to(user.room).emit('message',formatMessages(botName, user.username +' joined the Chat'));

    //users and room info
    io.to(user.room).emit('roomUsers',{
      room: user.room,
      users: getRoomUsers(user.room)
    });
    
  });

   //listen to the chatMessage sent
   socket.on('chatMessage',(msg)=>{
    const user=getCurrentUser(socket.id);
      io.to(user.room).emit('message',formatMessages(user.username,msg));
//        console.log(msg);
  });
    
    //broadcast to all users that a user has left the chat
    socket.on('disconnect',()=>{
      const user=leaveRoom(socket.id);
      if(user){
     io.to(user.room).emit('message',formatMessages(botName,user.username+' has left the chat')); 

     //users and room info
     io.to(user.room).emit('roomUsers',{
      room: user.room,
      users: getRoomUsers(user.room)
    });
      }  
    });
    
   
    
});
//app.use(express.static(path.join(_dirname, 'web')))
const PORT=3000 ||process.env.PORT;
server.listen(PORT,()=>console.log('Server Running on port:'+PORT));
