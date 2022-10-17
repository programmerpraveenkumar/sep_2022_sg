package CollectionSample;


//FunctionalInterface should have only one mtheod.
//it should annotate with FunctionalInterface
@FunctionalInterface
interface MathsSample{
    void add();
}
@FunctionalInterface
interface MathsSample1{
    void add(int a,int b);
}
@FunctionalInterface
interface MathsSample2{
    int add(int a,int b);
}
public class FuncIntrExampll {
    public static void main(String[] args) {
        MathsSample obj = ()->{
            System.out.println("sample output");
        };
        obj.add();
        MathsSample1 obj1 = (a,b)->{
            System.out.println("sample output"+(a+b));
        };
        obj1.add(5,10);
        obj1.add(5,20);

        MathsSample2 obj2 = (a,b)->{
            System.out.println("sample output"+(a+b));
            return  a+b;
        };
        int res = obj2.add(5,10);
        System.out.println("result with return "+res);

    }
}
