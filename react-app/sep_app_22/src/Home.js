import { useState } from "react";
import Footer from "./Footer";
import Header from "./Header";
// import './Page.css'
//react state
/*
document.getElementById('input_id').value
getter ->get the vaue from the variable
setter -> set the value to the vairable
*/
function Home(){
    //getter,setter
    const[email,setEmail] =  useState();//creating state variable.default value is undefined
    const [password,setPassword] = useState("");//default value is empty.
    const [mobile,setMobile] = useState("");
    const [userList,setUserList] = useState();//to store the value from the server.
    let name  = 'this is variable';
    let peopleList = [
        {"name":"sample name",'age':65},
        {"name":"sample name1",'age':55},
        {"name":"sample name2",'age':75},
        {"name":"sample name3",'age':85},
    ];
    const getApiResponse = (pageNo)=>{
        fetch("https://reqres.in/api/users?page="+pageNo)
        .then(res=>res.json())
        .then(res2=>{
            setUserList(res2['data']);//data is exist in the server response
            console.log(res2);
        })
    }
    //()=>{}
    const btn_click=()=>{
            console.log(email,password,mobile);//access the value from state
            if(email == undefined || email == ""){
                alert("Email should not be empty");
            }
            else if(password == undefined || password == ""){
                alert("password should not be empty");
            }
            else if(mobile == undefined || mobile == ""){
                alert("mobile should not be empty");
            }else{
                alert("everything is ok ");
            }
    }
    const text_change=(input_obj)=>{
        //let val = input_obj.target.value;//get the value from the input.
        //console.log("calling.",val);
        setEmail(input_obj.target.value);//set value for the email state.
    }
    const showLastName=(obj)=>{
        console.log(obj);
        alert(obj.last_name);
    }
    //map
    return(
        <div>
            <Header/>
            <h1>This is heading of home</h1>
            {/* data binding in react */}
            <h2>{name}</h2>
           
            <ul>
                {
                   peopleList.map((peopleObj,idx)=>{
                    return <li key={idx}>{peopleObj.name} -- {peopleObj.age}</li>
                   }) 
                }
            </ul>
            <div>
            {
                   peopleList.map((peopleObj,idx)=>{
                    return <div key={idx}>
                        <span className="people_name">{peopleObj.name}</span> -- {peopleObj.age}
                        
                    </div>
                   }) 
                }
            </div>
            <input onChange={(e)=>setEmail(e.target.value)} type="text" placeholder="Enter Email"/>
            <input onChange={(e)=>setPassword(e.target.value)} type="password" placeholder="Enter Password"/>
            <input onChange={(e)=>setMobile(e.target.value)} type="mobile_no" placeholder="ENter Mobile NO" />
            <button onClick={btn_click}>Click me</button>
            <h1>{email}{password}</h1>
            <select onChange={(e)=>getApiResponse(e.target.value)}>
                <option value="1"> Page 1</option>
                <option value="2"> Page 2</option>
                <option value="3"> Page 3</option>
                <option value="4"> Page 4</option>
                <option value="5"> Page 5</option>

            </select>
            <div><button onClick={getApiResponse}>Click to get API  Response</button></div>
            <div>
                {(userList && userList.length <=0)?<h1>No User Found</h1>:''}
            {
                  
                   userList && userList.map((userObj,idx)=>{
                    return  <div onClick={()=>showLastName(userObj)} key={idx}>{userObj.first_name} {userObj.email} {userObj.id} </div>
                   }) 
                }
               
            </div>
            <Footer/>
        </div>
    )
}
//export the function to use in other component
export default Home;