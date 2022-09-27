function UserList(props){
    const showUser=(userObj)=>{
        alert(userObj.first_name);
    }

    return(
        <>
        <h1>User List </h1>
        {(props.userList && props.userList.length <=0)?<h1>No User Found</h1>:''}
            {
                  
                props.userList && props.userList.map((userObj,idx)=>{
                    return  <div onClick={()=>showUser(userObj)} key={idx}>{userObj.first_name} {userObj.email} {userObj.id} </div>
                   }) 
                }

    
    </>
    )

}

export default UserList;