package GenericsSample;

public class MethodGenericSample {
    public static void main(String[] args) {
        MethodGenericSample obj = new MethodGenericSample();
        obj.printMessage("asdfasd");
        obj.printMessage(12312);
        obj.printMessage(45.25);
        obj.printMessage(true);

    }

    public <T> void printMessage(T message){
        System.out.println(message);
    }
}
