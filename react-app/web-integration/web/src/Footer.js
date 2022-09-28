import logo from './logo.svg';
import './App.css';

function Footer() {
  return (
    <footer>
         <div className="footer">
            <div className="container">
               <div className="row">
                  <div className="col-md-8 offset-md-2">
                     <ul className="location_icon">
                        <li><a href="#"><i className="fa fa-map-marker" aria-hidden="true"></i></a> Location</li>
                        <li><a href="#"><i className="fa fa-phone" aria-hidden="true"></i></a>+01 1234567890</li>
                        <li><a href="#"><i className="fa fa-envelope" aria-hidden="true"></i></a> demo@gmail.com</li>
                     </ul>
                  </div>
               </div>
            </div>
            <div className="copyright">
               <div className="container">
                  <div className="row">
                     <div className="col-md-12">
                        <p>© 2019 All Rights Reserved. Design by<a href="https://html.design/"> Free Html Templates</a></p>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </footer>
  );
}

export default Footer;
