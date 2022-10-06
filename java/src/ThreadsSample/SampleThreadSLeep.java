package ThreadsSample;

public class SampleThreadSLeep implements Runnable {



    public static void main(String[] args) {
        SampleThreadSLeep runnable = new SampleThreadSLeep();
//        try {
//            Thread.sleep(2000);//`Thread` is current thread
//        } catch (Exception e) {
//
//        }
//        runnable.simpforLoop();
//        runnable.simpforLoop();
        Thread th = new Thread(runnable);
        th.setName("first-thread");
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        th.start();
        th2.setPriority(Thread.MAX_PRIORITY);
        th1.setPriority(2);
        th.setPriority(3);

       // th.start(); error as it s started already.
//        try{
//            th.join();
//
//        }catch (Exception e){
//
//        }
//        try{
//            th.join();
//            th1.join();
//            th2.join();
//        }catch (Exception e){
//
//        }
        th1.start();
//        try{
//            th1.join();
//
//        }catch (Exception e){
//
//        }
        th2.start();
    }

    @Override
    public void run() {
        System.out.println("this is run method -- start--"+Thread.currentThread().getName());
        for(int i = 0;i<10;i++){
            try {

                Thread.sleep(500);//`Thread` is current thread
            } catch (Exception e) {

            }
            System.out.println("loop is "+i+" -- " +Thread.currentThread().getName());
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
