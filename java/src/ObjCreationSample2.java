public class ObjCreationSample2 {
    public static void main(String[] args) {
        ObjCreationSample2 obj = new ObjCreationSample2();
        obj.somelogic();
    }

    public void somelogic(){
        System.out.println(StaticSample.age);
        StaticSample.age = 5;//calling static varaible using classname
        StaticSample.printAge();//calling static method using classname

        StaticSample obj = new StaticSample();
        obj.name = "hi how are you";

        StaticSample obj1 = new StaticSample();
//        obj1.name = "hi how are you updatead";

        obj.pritnName();
        obj1.pritnName();
    }
}
