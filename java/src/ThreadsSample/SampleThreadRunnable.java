package ThreadsSample;

public class SampleThreadRunnable implements Runnable {



    public static void main(String[] args) {
        SampleThreadRunnable runnable = new SampleThreadRunnable();
//        runnable.simpforLoop();
//        runnable.simpforLoop();
        Thread th = new Thread(runnable);
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        th.start();
       // th.start(); error as it s started already.

        try{
            th.join();
            th1.join();
            th2.join();
        }catch (Exception e){

        }
        th1.start();
        th2.start();
    }

    @Override
    public void run() {
        System.out.println("this is run method -- start--");
        for(int i = 0;i<10;i++){
            System.out.println("loop is "+i);
        }

        System.out.println("this is run method -- end--");
    }

    public void simpforLoop(){
        System.out.println("this is run method -- start--");
        for(int i = 0;i<10;i++){
            System.out.println("loop is "+i);
        }

        System.out.println("this is run method -- end--");
    }
}
