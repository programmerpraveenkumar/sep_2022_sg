public class HelloWorld {

    // without main function ,jdk will not start the execution.
    /*
        primitive variables.
        variable declartion. let const var

        short->-132 to 132
        byte

        Whole numbers
            int
            long

        Decimal numbers
            float
            double


        boolean -> true or false
     */
    /*
    wrapper class
    int ->Integer
    long -> Long
    float -> Float
    double ->Double
    boolean -> Boolean
     */
    public static void main(String args[]){
        //below is local variable wch can be access in this function.
        int age = 45;
        boolean isChild = true;
        System.out.println("updated world");
        System.out.println(age);
        System.out.println(isChild);

        //wrapper classes
        Integer obj = new Integer(45);
        Long objl = new Long(454);
        String ageStr = "45";
        int ageint =   Integer.parseInt(ageStr);

    }
}
