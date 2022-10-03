public class MethodSample {
    int age = 45;
    public static void main(String[] args) {
        MethodSample obj = new MethodSample();
        //addition();//error
        int addition_Result =  obj.addition();//calling the method using object.
        System.out.println(obj.age);//calling the variable using object.
        String name = obj.getName();
        obj.additionWithArgs(10,15);
        obj.additionWithArgs(10,15,45);
        obj.additionWithArgs(10,15,"some message");
        //firstname
        //first and lastname

        int num = 100;
        obj.additionWithArgs(num,15);
       /// obj.additionWithArgs(100,15,45);
        System.out.println("result is "+addition_Result+" name is  "+name);
        String[] nameLIst = {"ads","asdf","asdf","asdf"};
        obj.iterateArray(nameLIst);

    }
//access_specifier->public,private,protected,default
    /*
        int,long,double,float
        String
        boolean
        void -> no_returnType
     */
    // access_specifier return_type|no_type name_of_function(){
    // }

    public int addition(){
        int a = 23;
        int b = 63;
        int c = a+b;
        int age = 45;//local variable
        System.out.println("Age is "+this.age);//this refers to global variable.
        System.out.println("Age is "+age);//local variable.
        int cc = additionWithArgs(a,b);//no need of create object.


        return c;///after return no line will be executed.error will come.
        //System.out.println("hi how are otyu");//error
    }
    public int additionWithArgs(int a, int b){
        int c = a+b;
        System.out.println("result is "+c);
        return c;///after return no line will be executed.error will come.
        //System.out.println("hi how are otyu");//error
    }
    //method overloading
    public int additionWithArgs(int a, int b,int c){
        int res = a+b;
        System.out.println("result is "+c);
        return c;///after return no line will be executed.error will come.
        //System.out.println("hi how are otyu");//error
    }
    //method overloading
    public void additionWithArgs(int a, String b){

    }

    //method overloading
    public int additionWithArgs(int a, int b,String message){
        int c = a+b;
        System.out.println("result is "+c);
        return c;///after return no line will be executed.error will come.
        //System.out.println("hi how are otyu");//error
    }
    public void  printMessage(){
        System.out.println("asdfasdfj;asdfk");
        //return "send me"; should not return.
    }
    public String getName(){
        return "sample name";
       // return 10;//error as it is int.
    }
    public void iterateArray(String[] nameList){
        for(String name :nameList){
            System.out.println(name);
        }
        // return 10;//error as it is int.
    }
}
