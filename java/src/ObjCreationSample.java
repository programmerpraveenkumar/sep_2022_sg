public class ObjCreationSample {
    public static void main(String[] args) {
        MethodSample obj = new MethodSample();
        obj.addition();
        StaticSample.printMessage();//calling static method using classname
        StaticSample.age = 5;//calling static varaible using classname
    }
}
