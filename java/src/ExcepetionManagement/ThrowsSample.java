package ExcepetionManagement;
/*
throw->to return the error
throws->declaring the method as it may return the error
throwable->parent class for all the exception.
 */

public class ThrowsSample {
    public static void main(String[] args) {
       /// checkChild(20);//compile error
    try{
        checkChild2(20);//unhandled exception.so wrap with try and catch.

    }catch (Exception e){
        e.printStackTrace();
            //print the error if needed.
    }

    }
    //below method may return the error or boolean.
    public static boolean checkChild2(int age)throws  CustomExcpetion{
        if(age >10){
            throw new CustomExcpetion("this is not child");//calling the constructor of Exception
        }else {
            System.out.println("this is child");
            return true;
        }
    }
    //below method may return the error or boolean.
//    public static boolean checkChild(int age)throws  Exception{
//        if(age >10){
//            throw new Exception("this is not child");//calling the constructor of Exception
//        }else {
//            System.out.println("this is child");
//            return true;
//        }
//    }

}
