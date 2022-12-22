package Multithreading.CreatingByRunnableFunctionalInterface;

public class RegularWay implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Hello");
        }
    }

    public static void main(String[] args) {
       RegularWay demo= new RegularWay();
        Thread thread=new Thread(demo);
        Thread thread1=new Thread(demo);
        thread.start();
        thread1.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Bye");
        }

    }
}
