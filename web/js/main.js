const ChatForm=document.getElementById('chat-form');
const chatMessages=document.querySelector('.chat-messages');
const roomName=document.getElementById('room-name');
const roomUsersList=document.getElementById('users');

const socket=io();
const {username, room}=Qs.parse(location.search,{
    ignoreQueryPrefix:true
});
    // console.log(username, room)
socket.emit('joinRoom', {username, room});

//room and user info
socket.on('roomUsers',({room, users})=>{
    outputRoomName(room);
    outputRoomUsers(users);
});

socket.on('message', message=>{
    console.log(message);
    outputMessage(message);
    chatMessages.scrollTop=chatMessages.scrollHeight;
});

ChatForm.addEventListener('submit', e=>{
    e.preventDefault();
    const msg=e.target.elements.msg.value;
//    console.log(msg);
    
    //emit message to the srver
    socket.emit('chatMessage', msg);
//    clear the input
    e.target.elements.msg.value="";
    e.target.elements.msg.focus();
    
});

//add message to DOM
function outputMessage(message){
    const div=document.createElement('div');

    div.classList.add('message');
    div.innerHTML='<p class="meta">'+message.username +' '+'<span>'+message.time+'</span></p><p class="text">'+
                message.text
                +'</p>';
    document.querySelector('.chat-messages').appendChild(div);                                          
}


//add room name to DOM
function outputRoomName(room){
    roomName.innerText=room;
}

//add room users to DOM
function outputRoomUsers(users){
    roomUsersList.innerHTML=users.map(user=>'<li>'+user.username+'</li>').join("");
}

