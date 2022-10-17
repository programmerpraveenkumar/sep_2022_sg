import logo from './logo.svg';
import './App.css';
import { NavLink } from 'react-router-dom';
import { useEffect, useState } from 'react';
import { useNavigate } from "react-router-dom";

function Header(props) {
   const[isLoggedIn,setIsLoggedIn] = useState(false);
   let navigate = useNavigate(); 

   const checkLoginToken=()=>{
      let token = localStorage.getItem("token");
      if(token == undefined || token == ""){
         setIsLoggedIn(false);
      }else{
         setIsLoggedIn(true);
      }
   }
   const logout_api=()=>{
      let userId = localStorage.getItem("userId"); 
      let token = localStorage.getItem("token"); 
      fetch("http://localhost:8080/user/logout/"+userId,{
         method:"POST",
         headers:{
            "content-type":"application/json",
            "token":token,
            "userId":userId
         }
      })
      .then(res=>{
            if(!res.ok){
               throw res;
            }
             return res.json();
            }
         )
         .then(ress2=>{
              //clear the toekn and navigate to login page  after success logout
              localStorage.removeItem("token");
              localStorage.removeItem("userId");
              localStorage.removeItem("full_response");
              navigate("/login");
              

         }).catch(e=>{

         e.json().then(er=>{
            console.log("Eror while fechging the records",er)
            alert("Eror while fechging the records");
         });
         
      })
   }
   useEffect(checkLoginToken,[]);//will be trigger during the page for tokenvalidation.
  return (
    <header>
   
    <div className="header">
       <div className="container-fluid">
          <div className="row">
             <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                <div className="full">
                   <div className="center-desk">
                      <div className="logo">
                         <a href="index.html"><img src="images/logo.png" alt="#" /></a>
                      </div>
                   </div>
                </div>
             </div>
             <div className="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                <nav className="navigation navbar navbar-expand-md navbar-dark ">
                   <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                   <span className="navbar-toggler-icon"></span>
                   </button>
                   <div className="collapse navbar-collapse" id="navbarsExample04">
                      <ul className="navbar-nav mr-auto">
                        {/* hide the home menu for login page */}
                        {!props.isLoginPage?<><li className="nav-item active">
                            <NavLink className="nav-link" to="/home" >Home</NavLink>
                         </li></>:null}
                         
                         <li className="nav-item">
                            <NavLink className="nav-link" to="/about" >About</NavLink>
                         </li>
                         <li className="nav-item">
                            <a className="nav-link" href="glasses.html">Our Glasses</a>
                         </li>
                         <li className="nav-item">
                            <a className="nav-link" href="shop.html">Shop</a>
                         </li>
                         <li className="nav-item">
                            <a className="nav-link" href="contact.html">Contact Us</a>
                         </li>
                         {isLoggedIn?<>
                         <li onClick={logout_api} className="nav-item d_none login_btn">
                            <a className="nav-link" href="#">Logout</a>
                         </li></>:null}
                         {!isLoggedIn?<>
                         <li className="nav-item d_none login_btn">
                            <a className="nav-link" href="#">Login</a>
                         </li>
                         <li className="nav-item d_none">
                            <a className="nav-link" href="#">Register</a>
                         </li></>
                         :null}
                         <li className="nav-item d_none sea_icon">
                            <a className="nav-link" href="#"><i className="fa fa-shopping-bag" aria-hidden="true"></i><i className="fa fa-search" aria-hidden="true"></i></a>
                         </li>
                      </ul>
                   </div>
                </nav>
             </div>
          </div>
       </div>
    </div>
 </header>
  );
}

export default Header;
