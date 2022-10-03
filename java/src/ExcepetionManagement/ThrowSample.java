package ExcepetionManagement;

import java.io.IOException;

public class ThrowSample {
    public static void main(String[] args) {
        checkChild(20);
        checkChild(10);
    }
    public static void checkChild(int age){
        try{
            if(age >10){
                throw new Exception("this is not child");//calling the constructor of Exception
            }else{
                System.out.println("this is child");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Error "+e.getMessage());
        }

    }
}
