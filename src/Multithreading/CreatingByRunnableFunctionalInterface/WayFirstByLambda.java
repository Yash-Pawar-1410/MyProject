package Multithreading.CreatingByRunnableFunctionalInterface;

public class WayFirstByLambda implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Hello");
        }
    }

    public static void main(String[] args) {
        WayFirstByLambda wayFirstByLambda=new WayFirstByLambda();
        Thread thread1=new Thread(wayFirstByLambda);
        Thread thread=new Thread(()-> {
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName()+" By lambda");
            }
        });
        thread.start();
        thread1.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Main");
        }
    }
}
