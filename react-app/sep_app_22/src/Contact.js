import Footer from "./Footer";
import Header from "./Header";
function Contact(){
    let name  = 'this is variable';
    return(
        <div>
            <Header/>
            <h1>This is heading of Contact</h1>
            {/* data binding in react */}
            <h2>{name}</h2>
            <Footer/>
        </div>
    )
}
//export the function to use in other component
export default Contact;