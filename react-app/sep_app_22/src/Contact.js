import { useState } from "react";
import Footer from "./Footer";
import Header from "./Header";
function Contact(){
    const [people,setPeople] = useState([]);
    const [name,setName] = useState('');
    const [age,setAge] = useState('');
   // let name  = 'this is variable';
    const[message,setMessage] =  useState('');//creating state variable.default value is undefined
    const[error,setError] =  useState();//creating state variable.default value is undefined
    const validate=()=>{
        if(message == ""){
                setError(true);
        }else{
            setError(false);
        }
    }
    const addPeople=()=>{
        if(name != "" && age != ""){
            setPeople([...people,{'name':name,"age":age}]);
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
            <input  onChange={(e)=>setName(e.target.value)} type="text" placeholder="Enter Name"/>
               <input   onChange={(e)=>setAge(e.target.value)} type="text" placeholder="Enter Age"/>
            {people.map((obj,index)=>{
                return <div>{obj.name} {obj.age}</div>
            })}
            <button onClick={addPeople}>addPeople</button>

                <Footer/>
        </div>
    )
}
//export the function to use in other component
export default Contact;