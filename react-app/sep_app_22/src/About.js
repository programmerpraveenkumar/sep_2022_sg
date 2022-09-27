import { useState } from "react";
import Footer from "./Footer";
import Header from "./Header";

function About(){
    let name  = 'this is variable';
    let peopleList = [
        {"name":"sample name",'age':65},
        {"name":"sample name1",'age':55},
        {"name":"sample name2",'age':35},
        {"name":"sample name3",'age':115},
    ];
    const[headingClassName,setHeadingClassName] = useState('heading_2');
    return(
        <div>
            <Header menuname='about'/>
            <h1>This is heading of about</h1>
            {/* data binding in react */}
            <h2 className={headingClassName}>{name}</h2>
            <button onClick={()=>setHeadingClassName('heading_2')}>Heading Class 2</button>
            <button onClick={()=>setHeadingClassName('heading_3')}>Heading Class 3</button>
            <button onClick={()=>setHeadingClassName('heading_4')}>Heading Class 4</button>
            <ul>
                {
                   peopleList.map((peopleObj,idx)=>{
                    return <li className={peopleObj.age>40?'heading_2':"heading_4"}>{peopleObj.name} -- {peopleObj.age}</li>
                   }) 
                }
            </ul>
            <Footer/>
        </div>
    )
}
//export the function to use in other component
export default About;