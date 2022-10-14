import logo from './logo.svg';
import './App.css';
import Header from './Header';
import Footer from './Footer';
import { useEffect, useState } from 'react';

function Login() {
   const[userEmail,setUserEmail] = useState();
   const[password,setPassword] = useState();
   

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
      fetch("http://localhost:8080/user/userLogin",{
        method:"post",
        body:JSON.stringify(req),
        headers:{
            "content-type":"application/json"
        }
        
      })
      .then(res=>{
        if(!res.ok){
            throw res
        }
        res.json().then(res=>{
            localStorage.setItem("full_response",JSON.stringify(res));
            localStorage.setItem("token",res['token']);
            localStorage.setItem("userId",res['id']);
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
   <Header/>

      
      
     
      
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
                           <input  onChange={(e=>setUserEmail(e.target.value))} class="contactus" placeholder="Email" type="type" name="Email"/>                          
                        </div>
                        <div class="col-md-12">
                           <input class="contactusmess"onChange={(e=>setPassword(e.target.value))}  placeholder="Message" type="type" Message="Name"/>
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
   <Footer/>
   </>
  );
}

export default Login;
