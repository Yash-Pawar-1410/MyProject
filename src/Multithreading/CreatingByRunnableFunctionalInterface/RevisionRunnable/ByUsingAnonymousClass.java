package Multithreading.CreatingByRunnableFunctionalInterface.RevisionRunnable;

public class ByUsingAnonymousClass implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" this is run method");
    }

    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" this is a anonymous class");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        ByUsingAnonymousClass byUsingAnonymousClass=new ByUsingAnonymousClass();
        Thread thread1=new Thread(byUsingAnonymousClass);
        thread1.start();
        System.out.println(Thread.currentThread().getName()+" this is a main method");

    }
}
