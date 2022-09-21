import Footer from "./Footer";
import Header from "./Header";

function About(){
    let name  = 'this is variable';
    return(
        <div>
            <Header/>
            <h1>This is heading of about</h1>
            {/* data binding in react */}
            <h2>{name}</h2>
            <Footer/>
        </div>
    )
}
//export the function to use in other component
export default About;