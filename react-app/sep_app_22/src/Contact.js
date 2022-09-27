import { useState } from "react";
import Footer from "./Footer";
import Header from "./Header";
function Contact(){
    let name  = 'this is variable';
    const[message,setMessage] =  useState('');//creating state variable.default value is undefined
    const[error,setError] =  useState();//creating state variable.default value is undefined
    const validate=()=>{
        if(message == ""){
                setError(true);
        }else{
            setError(false);
        }
    }
    return(
        <div>
            <Header/>
            <h1>This is heading of Contact</h1>
            {/* data binding in react */}
            <div>
            <input value={message} className={error?'errorClass':""} onChange={(e)=>setMessage(e.target.value)}
             type="text" placeholder="Enter message"/>
                {error?<span class="errorClass">Please ENter name</span>:""}
            </div>
            
            <button onClick={validate}>Click me</button>
                <Footer/>
        </div>
    )
}
//export the function to use in other component
export default Contact;