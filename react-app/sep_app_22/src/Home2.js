
import React from 'react';
import Comp1 from './Comp1';
import Comp2 from './Comp2';
import Header from './Header';
import Home3 from './Home3';
import UserList from './UserList';

class Home2 extends React.Component{
    // state = {
    //     "name":"test",
    //     "age":45,
    //     "city":"some city",
    //     "countryName":'',
    //     "peopleList":[]
    //    }
    //below will cal while creating object
    constructor(){
       super();//calling the parent class constructor
       //state variable in clas component
       this.state = {
        "name":"hi how are you",
        "password":"",
        "age":45,
        "city":"some city",
        "countryName":'',
        "peopleList":[],
        "userList":[],
        "headingClass":"",
        "showComp1":false,
        "showComp2":false,
        "showComp3":false
       }
      

       //this.state.name //access the varible from state.
       //this.state.age
    }
    // //react lifecycle method will be called during page load only once.
    // componentDidMount(){
    //     //console.log("this is componentDidMount");
    //     this.getApiResponse(1);//will be called during the page load.
    // }
    // // //react lifecycle method will be called during page unload only once.
    // componentWillUnmount(){
    //     console.log("this is home2 componentwillunmount")
    // }
     getApiResponse = (pageNo)=>{
        fetch("https://reqres.in/api/users?page="+pageNo)
        .then(res=>res.json())
        .then(res2=>{
            this.setState({"userList":res2['data']});//update the server respon to the state.
            console.log(res2);
        })
    }
   postApiResponse = ()=>{
        let param  = {
            "name":"sasdf",//TODO has to come from input box
            "job":"some job"//TODO  has to come from input box
        }
        fetch("https://reqres.in/api/users",
        {method:"POST",body:JSON.stringify(param)})
        .then(res=>res.json())
        .then(res2=>{
            this.setState({"userList":res2['data']});//update the server respon to the state.
            console.log(res2);
        })
    }
    changeName=()=>{
        this.setState({"name":"hi i have updated"});
    }
    validate=()=>{
       // this.setState({"name":"new value","age":"85"});//update state.
       if(this.state.name == ""){
        alert("name is empty");
       }else if(this.state.password == ""){
        alert("password is empty");
       }else{
        alert("everything is ok ")
       }
       
       // console.log("button clicked",this.state.name);
    }
    
    //return the html from this clas compoentn
    render(){
        return (
            <div>
                <Header menuname="home2" submenu="some submenu value"/>
                <h1>this is class componet</h1>
                <input type="text" value={this.state.name} onChange={(e)=>this.setState({"name":e.target.value})} />
                <input type="text" onChange={(e)=>this.setState({"password":e.target.value})} />

                <button onClick={this.validate}>Click me</button>
                
                <button onClick={this.changeName}>change the variable</button>
                <div>
                    <button onClick={()=>this.getApiResponse(1)}>getApiResponse</button>
                    <select onChange={(e)=>this.getApiResponse(e.target.value)}>
                        <option value="1"> page 1</option>
                        <option value="2"> page 2</option>
                        <option value="3"> page 3</option>
                        <option value="4"> page 4</option>
                    </select>
                    <UserList userList={this.state.userList}/>
                    {/* {(this.state.userList && this.state.userList.length <=0)?<h1>No User Found</h1>:''}
            {
                  
                  this.state.userList && this.state.userList.map((userObj,idx)=>{
                    return  <div onClick={()=>this.showUser(userObj)}  key={idx}>{userObj.first_name} {userObj.email} {userObj.id} </div>
                   }) 
                } */}
                  <h2 className={this.state.headingClass}>asdfasdfsdf</h2>
                <button onClick={()=>this.setState({"headingClass":"heading_2"})}>Heading Class 2</button>
                <button onClick={()=>this.setState({"headingClass":"heading_3"}) }>Heading Class 3</button>
                <button onClick={()=>this.setState({"headingClass":"heading_4"})}>Heading Class 4</button>
                </div>
                {this.state.showComp1?<Comp1/>:null}
                {this.state.showComp2?<Comp2/>:null}
                <button onClick={()=>this.setState({'showComp1':true})}>show COmp1</button>
                <button onClick={()=>this.setState({'showComp2':true})}>show COmp2</button>
                <button onClick={()=>this.setState({'showComp1':false})}>hide COmp1</button>
                <button onClick={()=>this.setState({'showComp2':false})}>hide COmp2</button>
                {this.state.showComp3?<div><Home3/></div>:null}
                <button onClick={()=>this.setState({'showComp3':true})}>Show COmp3</button>
                <button onClick={()=>this.setState({'showComp3':false})}>hide COmp3</button>
            </div>
        )
    }
}

export default Home2;