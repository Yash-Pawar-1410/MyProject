package Multithreading.JoinMethod;

public class Demo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Demo demo=new Demo();
        Thread thread=new Thread(demo);
        thread.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("main thread");
            Thread.sleep(2000);
        }
    }
}
