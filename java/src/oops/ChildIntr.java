package oops;

public class ChildIntr implements PersonDetailsIntr,PersonDetailsIntr2 {
    @Override
    public void printMessage() {
        System.out.println("print message in childintr");
    }

    @Override
    public void printMessage1() {
        //any logc
        System.out.println("print message1 in childintr");
    }
    void printName(){
        System.out.println("this is child name method");
    }

    public static void main(String[] args) {
        ChildIntr obj  = new ChildIntr();
        obj.printMessage();

        PersonDetailsIntr objintr = new ChildIntr();
        objintr.printMessage();
        objintr.printMessage1();
        //objintr.printName();//error
    }
    @Override
    public void printMessage3() {
        System.out.println("print message3 in childintr");

    }
}
