class Person{
    // Will be called while creatin object.
    //var let const
    // constructor(name,age){
    //         /*
    //             `this` refers to current class.
    //             `this` always refers to global.
    //         */
    //    name =name;
    //     this.age = age;
    //     console.log("this is constructor");
    // }
    
    constructor(){
        //let name = "usernmae";
        this.name = 'username';//variable creation.
    }
   
    printName(){
        console.log(this.name);
    }
    printDetails(){
        console.log(this.name,this.age);
    }
    printMessage1(){
            console.log("this is print message")
    }
}
 let user1Obj = new Person("user1",25);//creating object for the  class
 let user2Obj = new Person("user2",35);//creating object for the  class
 user1Obj.printName();//access method usign obejct
 console.log(user1Obj.name);//access variable using object
user1Obj.name = "updated here";//update the value of the variable usign object.
 user1Obj.printName();


 
 user2Obj.name = "updated here for user2 obj";//update the value of the variable usign object.
 user2Obj.printName();
 user1Obj.printName();//access method usign obejct
 console.log(user1Obj.name);//access variable using object
user1Obj.name = "updated here";//update the value of the variable usign object.