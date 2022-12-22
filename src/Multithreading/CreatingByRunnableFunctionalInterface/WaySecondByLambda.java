package Multithreading.CreatingByRunnableFunctionalInterface;

public class WaySecondByLambda implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Hello");
        }
    }

    public static void main(String[] args) {
        WaySecondByLambda wayFirstByLambda=new WaySecondByLambda();
        Thread thread1=new Thread(wayFirstByLambda);
        Runnable runnable=()-> {
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName()+" By lambda pass in runnable");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        thread1.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Main");
        }
    }
}
