package oops;
/*
access specifier
public
private
protected
default->no need to menetion
 */
public class Parent {
   private int age = 45;
    private String name = "asdf";

  void addition(int a, int b){
        System.out.println("this is parent "+(a+b));
    }

    public void subtraction(int a ,int b){
        addition(a,b);
        System.out.println(b-a);

    }
    //public void subtraction(int a ,int b);

}
