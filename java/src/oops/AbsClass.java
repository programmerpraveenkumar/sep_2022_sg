package oops;
/*
    for abstract class,cannot create object.
    so it can be used only in the inheritance
    if any method declared as abstract,method should have only declaration.
            so definition shuld be in child class.
 */
public abstract  class AbsClass {
    int age = 56;
    public void addition(int a ,int b){
        System.out.println(a+b);
    }
    //method declaration.it shld not have definition.so definition shuld be in child class.
    abstract protected void printMessage(String message);
}
