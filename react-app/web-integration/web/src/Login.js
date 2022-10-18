import logo from './logo.svg';
import './App.css';
import Header from './Header';
import Footer from './Footer';
import { useEffect, useState } from 'react';
import { useNavigate } from "react-router-dom";
import { httpPostWithoutHeader } from './HTTPFetch';

function Login() {
   const[userEmail,setUserEmail] = useState();
   const[password,setPassword] = useState();
   const[loginstatus,setloginstatus] = useState(false);
   const[loginData,setLoginData] = useState(false);
   let navigate = useNavigate(); 

   const loginApi=()=>{
    if(userEmail == ""){
        alert("Email should nt empty")
        return;
    }else if(password == ""){
        alert("Email should nt empty")
        return;
    }
    let req = {
        "email":userEmail,
        "password":password
        }
        httpPostWithoutHeader("user/userLogin",req)
      .then(res=>{
        if(!res.ok){
            throw res
        }
        //let statuscode = res.statuscode;
        res.json().then(res=>{
            localStorage.setItem("full_response",JSON.stringify(res));
            localStorage.setItem("token",res['token']);
            localStorage.setItem("userId",res['id']);
            navigate("/home");
            console.log(res);
        })
      }
        ).catch(err=>{
            alert("Error while login");
            //err.json().then(alert("Error while login"))
        })
      
   }
   
  return (
   <>
   <Header   isLoginPage="true"/>
      
      <div id="contact" class="contact">
         <div class="container">
            <div class="row">
               <div class="col-md-6">
                  <form id="request" class="main_form">
                     <div class="row">
                        <div class="col-md-12 ">
                           <h3>Login</h3>
                        </div>
                        <div class="col-md-12">
                           <input  onChange={(e=>setUserEmail(e.target.value))} class="contactus" placeholder="Enter Email" type="type" name="Email"/>                          
                        </div>
                        <div class="col-md-12">
                           <input class="contactusmess"onChange={(e=>setPassword(e.target.value))}  placeholder="Enter Password" type="type" Message="Name"/>
                        </div>
                        <div class="col-md-12">
                           <input type="button" class="send_btn" onClick={loginApi} value="Login"/>
                        </div>
                     </div>
                  </form>
               </div>
            </div>
         </div>
         <div class="container-fluid">
            <div class="map_section">
               <div id="map">
               </div>
            </div>
         </div>
      </div>
      {loginstatus?"successful login":null}
   <Footer/>
   </>
  );
}

export default Login;
