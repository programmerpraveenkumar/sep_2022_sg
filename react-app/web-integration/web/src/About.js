import './App.css';
import Footer from './Footer';
import Header from './Header';

function About() {
  return (
    <>
    <Header/>
    <div className="about">
         <div className="container">
            <div className="row d_flex">
               <div className="col-md-5">
                  <div className="about_img">
                     <figure><img src="images/about_img.png" alt="#"/></figure>
                  </div>
               </div>
               <div className="col-md-7">
                  <div className="titlepage">
                     <h2>About Our Shop</h2>
                     <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.</p>
                  </div>
                  <a className="read_more" href="#">Read More</a>
               </div>
            </div>
         </div>
      </div>
    <Footer/>
    </>
  )
}

export default About;