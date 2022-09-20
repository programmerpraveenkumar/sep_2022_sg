class Parent{
    printMessage(){
        console.log("this is from parent");
    }
}

//inherit the paret class using `extends`
class Child extends Parent{
    printCHild(){
        console.log("this is from child");
    }
}
class Child2 extends Parent{

}
let child = new Child();//create obj for child clas
child.printCHild();//callin child method using child obj
child.printMessage();//calling parent class usign child obj