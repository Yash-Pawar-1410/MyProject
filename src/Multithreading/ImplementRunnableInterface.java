package Multithreading;

public class ImplementRunnableInterface implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {

            System.out.println("run method "+Thread.currentThread().getName()+" thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <20 ; i++) {
            System.out.println("main method "+Thread.currentThread().getName()+" thread");
        }
        ImplementRunnableInterface implementRunnableInterface=new ImplementRunnableInterface();
        Thread thread=new Thread(implementRunnableInterface);
        thread.start();
    }
}
