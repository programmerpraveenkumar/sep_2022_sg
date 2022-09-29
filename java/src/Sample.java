public class Sample {
    //global variables..inside class.outside the function
    int age = 45;
    boolean isChild = true;
    int num1 = 45;
    int num2 = 89;
    String personName ="23423dfghsgewrtwert  64646er twer6t4we6r48t we8r";

    public static void main(String[] args) {
        ///to access variable need to crate object for this class.
        //classname obj = new Classname();
        Sample  sample = new Sample();
        System.out.println("age is "+sample.age);//access the variable using object.
        System.out.println("Child is "+sample.isChild);//access the variable using object.
        System.out.println("Child is "+sample.personName);//access the variable using object.
        int result = sample.num1+sample.num2;
        System.out.println("result is "+result);
//        for(int staasdfasdfrt = 0;start<10;start++){
//            //TODO.
//        }
        //int start = 5;//
//        while(start >10){
//
//
//        }
//        do{
//
//
//        }while(start > 10)
    }
}
