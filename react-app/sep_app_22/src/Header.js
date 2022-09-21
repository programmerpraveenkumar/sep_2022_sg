import './App.css';
function Header(){
    let name  = 'this is variable';
    return(
        <ul className='menu'>

            <li><a href="home">Home</a></li>
            <li><a href="about">About</a></li>
            <li><a href="contact">Contact</a></li>
            <li><a href="#">Logout</a></li>

        </ul>
    )
}
//export the function to use in other component
export default Header;