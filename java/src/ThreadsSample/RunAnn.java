package ThreadsSample;



public class RunAnn {
    public static void main(String[] args) {
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    System.out.println("sample thread");
                }
            };
            new Thread(run).start();
    }
}
