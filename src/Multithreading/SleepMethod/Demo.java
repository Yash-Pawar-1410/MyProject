package Multithreading.SleepMethod;

public class Demo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("hello thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            System.out.println("hello main thread");
            Thread.sleep(500);
        }
        Demo demo=new Demo();
        Thread thread=new Thread(demo);
        thread.start();
    }
}
