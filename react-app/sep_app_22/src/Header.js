import { useEffect, useState } from 'react';
import './App.css';
function Header(props){
    let name  = 'this is variable';
    const [isExist,setIsExist] = useState(false);
    useEffect(()=>{
            if(localStorage.getItem("token") != undefined && localStorage.getItem("token") != ''){
                setIsExist(true);
            }else{
                setIsExist(false);
            }
    },[])
   
    return(
        
        <ul className='menu'>
             <li>Recvd value is {props.menuname} {props.submenu}</li>
            <li className={props.menuname =='home'?"active":''} ><a href="home">Home</a></li>
            <li className={props.menuname =='home2'?"active":''} ><a href="home2">Home 2</a></li>
            <li className={props.menuname =='about'?"active":''} ><a href="about">About</a></li>
            <li className={props.menuname =='contact'?"active":''} ><a href="contact">Contact</a></li>
           {isExist?<li><a href="#">Logout</a></li>:null}

        </ul>
    )
}
//export the function to use in other component
export default Header;