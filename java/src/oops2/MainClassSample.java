package oops2;

class Shape{
    public void printName(){
        System.out.println("this is parent class");
    }
}

class Round extends  Shape{
    @Override
    public void printName() {
        System.out.println("this is round shape");
    }
}

class Rectangle  extends  Shape{
    @Override
    public void printName() {
        System.out.println("this is Rectangle shape");
    }
}

public class MainClassSample {
    public static void main(String[] args) {
        Round round = new Round();
        Rectangle rectangle = new Rectangle();

        round.printName();
        rectangle.printName();
    }
}
