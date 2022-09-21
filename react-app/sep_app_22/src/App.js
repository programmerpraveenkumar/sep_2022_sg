import logo from './logo.svg';
import './App.css';
import Home from './Home';
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";
import About from './About';
import Contact from './Contact';
import Header from './Header';

function App() {
  return (
   <>
   {/* for each url write the navigation */}
  
   <Router>
      <Routes>
          <Route path="/home" element={<Home/>}/>          
          <Route path="/about" element={<About/>}/>            
          <Route path="/contact" element={<Contact/>}/>

          <Route path="/" element={<Home/>}/>
      </Routes>
   </Router>

   </>
   
  );
}

export default App;
