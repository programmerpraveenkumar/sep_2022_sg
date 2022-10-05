package ThreadsSample;

public class SampleThreadRunnable implements Runnable {



    public static void main(String[] args) {
        SampleThreadRunnable runnable = new SampleThreadRunnable();
        Thread th = new Thread(runnable);
        th.start();
    }

    @Override
    public void run() {
        System.out.println("this is run method");
    }
}
