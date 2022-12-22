package Multithreading.CreatingByRunnableFunctionalInterface;

public class WayThirdByLambda implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Hello");
        }
    }

    public static void main(String[] args) {
        WayThirdByLambda wayFirstByLambda=new WayThirdByLambda();
        Thread thread1=new Thread(wayFirstByLambda);
        thread1.start();
        new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" Lambda");
            }
        }).start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Main");
        }
    }
}
