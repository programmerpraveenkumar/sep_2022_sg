import logo from './logo.svg';
import './App.css';
import { NavLink } from 'react-router-dom';

function Header() {
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
                         <li className="nav-item active">
                            <NavLink className="nav-link" to="/home" >Home</NavLink>
                         </li>
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
                         <li className="nav-item d_none login_btn">
                            <a className="nav-link" href="#">Login</a>
                         </li>
                         <li className="nav-item d_none">
                            <a className="nav-link" href="#">Register</a>
                         </li>
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
