const users=[];
//join chatRoom
function joinRoom(id, username, room){

    const user={id, username, room}

    users.push(user);
    return user;
}

//get current user
function getCurrentUser(id){
    return users.find(user =>user.id===id)
}

//user leaves the chat Room
function leaveRoom(id){
    const index=users.findIndex(user => user.id===id);
    if (index !==-1){
        return users.splice(index, 1)[0];
    } 
}

//find the room users
function getRoomUsers(room){
    return users.filter(user =>user.room===room)
}
module.exports={joinRoom, getCurrentUser,  leaveRoom, getRoomUsers};