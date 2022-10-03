package ExcepetionManagement;
/*
    1.all exceptionclass in java should inherit from the exception.
    2.child exception class should use the constructor with one argument.
    3.child constructor should call the parent constructor with super().

 */
public class CustomExcpetion extends  Exception{
    CustomExcpetion(String message){
        //calling parent class constructor
        //super("no error passing");
        super(message);
        System.out.println(message);
    }
    CustomExcpetion(String message,int errorCode){
        //calling parent class constructor
        super(message);
    }
}
