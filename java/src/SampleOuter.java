public class SampleOuter {


    public static void main(String[] args) {
        InnerAndOuter out  = new InnerAndOuter();
        InnerAndOuter.Inner in = out.new Inner();
        //in.name//cannot access
    }
}
