import logo from './logo.svg';
import './App.css';
import Home from './Home';
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";
import About from './About';
import Contact from './Contact';
import Header from './Header';
import Home2 from './Home2';

function App() {
  return (
   <>
   {/* for each url write the navigation */}

   <Router>
      <Routes>
          <Route path="/home" element={<Home/>}/>          
          <Route path="/about" element={<About/>}/>            
          <Route path="/contact" element={<Contact/>}/>
          <Route path="/home2" element={<Home2/>}/>
          <Route path="/" element={<Home/>}/>
      </Routes>
   </Router>

   </>
   
  );
}

export default App;
