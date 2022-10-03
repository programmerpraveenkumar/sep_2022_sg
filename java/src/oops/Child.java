package oops;

//inheritance->inheriting all the props from the parent class.
//using extends inheritance can be done.
public class Child extends Parent {

    @Override//override the parent method in the child class.
    public void addition(int a, int b) {

     System.out.println("this is child "+(a+b));
    }
    void printMessage(){
        System.out.println("this is child method");
    }
    public static void main(String[] args) {
        Child child = new Child();
       // System.out.println(child.age);//access the parent variable using child object
        child.addition(10,15);
        child.subtraction(50,2);

        Parent parent = new Parent();
        Parent parent1 = new Child();//child class methods cannot access.except override method.


        child.addition(10,15);
        parent1.addition(100,15);
        parent.addition(110,15);
        child.printMessage();


    }
}
