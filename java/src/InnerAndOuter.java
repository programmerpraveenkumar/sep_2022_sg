public class InnerAndOuter {
    private int age = 45;
    class Inner{
        private String name ="sample name";
        void printAge(){
            System.out.println(age);//access outer class vairable.
        }
    }

    public static void main(String[] args) {
        InnerAndOuter out = new InnerAndOuter();
        Inner in  = out.new Inner();
        System.out.println(in.name);
        in.printAge();
    }
}
