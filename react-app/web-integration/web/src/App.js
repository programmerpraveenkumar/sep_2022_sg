import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";
import Home from './Home';
import About from './About';
import Login from './Login';

function App() {
  return (
    <Router>
      <Routes>
          <Route path="/home" element={<Home/>}/> 
          <Route path="/about" element={<About/>}/> 
          <Route path="/" element={<Home/>}/>
          <Route path="/login" element={<Login/>}/>
      </Routes>
   </Router>

  );
}

export default App;
