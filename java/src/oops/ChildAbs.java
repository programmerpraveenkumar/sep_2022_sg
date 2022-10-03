package oops;

public class ChildAbs extends AbsClass {

    @Override
    protected void printMessage(String message) {
        System.out.println(message);
    }

    void childMethod(){
        System.out.println("this is child method");
    }

    public static void main(String[] args) {
       // AbsClass abs1 = new AbsClass();//error
        AbsClass abs = new ChildAbs();//create object with child class
        abs.printMessage("this is from main function");
       // abs.childMethod();

        ChildAbs absCHild = new ChildAbs();
        absCHild.childMethod();
    }
}
