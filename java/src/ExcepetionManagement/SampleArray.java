package ExcepetionManagement;

import java.io.IOException;

/*

try{

}catch(Exception e){

}
 */
public class SampleArray {
    public static void main(String[] args) {
        System.out.println("this is the starting line");
        try{
            String[] name = {"asdf","adsf","asdf"};
            System.out.println(name[1]);
            //file exception
        }
//        catch (ArrayIndexOutOfBoundsException error){
//            System.err.println("Error occurred.during index "+error.getMessage());
//        }
        catch(Exception e){
//            e.printStackTrace();
            System.out.println("Error occurred."+e.getMessage());
            System.err.println("Error occurred.during index "+e.getMessage());
        }finally {
            System.out.println("finally block ");
            //always executed either try or catch
        }


        System.out.println("this is the end of the program");
    }
}
