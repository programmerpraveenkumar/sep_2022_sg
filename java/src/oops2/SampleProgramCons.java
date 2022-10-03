package oops2;
/*
constructor->method name same as classname
    will be trigger during the object creation.
 */
public class SampleProgramCons {
    //method name same as classname

    SampleProgramCons(){
        System.out.println("this is constructor1");
    }
    //constructor overloading.
    SampleProgramCons(String name){
        System.out.println("this is constructor2");
    }
    //constructor overloading.
    SampleProgramCons(String name,int age){
        System.out.println("this is constructor3");
    }

    public static void main(String[] args) {
        new SampleProgramCons();
        new SampleProgramCons("this is some message");
    }
}
