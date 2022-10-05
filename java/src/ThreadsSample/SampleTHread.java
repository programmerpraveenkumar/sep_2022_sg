package ThreadsSample;

public class SampleTHread extends Thread {

    //below method will create new thread from the main thread.
//    @Override
//    public void run() {
//        System.out.println("this is thread run method");
//    }

    public static void main(String[] args) {
        SampleTHread obj  = new SampleTHread();
        obj.start();//will start the new thread.
       // obj.run();//stil on the main thread.
    }
}
