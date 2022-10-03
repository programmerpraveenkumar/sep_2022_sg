public class StaticSample {
/*
for static variable or method no need of objects.
 */
    static int age = 45;//static variable.
    String name = "old name";
    public static void main(String[] args) {
        printMessage();//no need to use obj to call static function.
        System.out.println(age);
        //getName();
    }
    public static  void printAge(){
        System.out.println(age);
    }
    public   void pritnName(){
        System.out.println(this.name);
    }

    public static void printMessage(){
        System.out.println("this is simple static method");
        StaticSample obj = new StaticSample();
        obj.addition();
        getName();
       // addition();//will throw the error.
    }
    public static int getInt(){
        System.out.println("this is simple static method");
        StaticSample obj = new StaticSample();
        obj.addition();
        getName();
        return 10;
        // addition();//will throw the error.
    }

    public static String getName(){
        return "sample name";
        // addition();//will throw the error.
    }

    public void addition(){
        printMessage();//no need of object.
    }

}
