package Multithreading.CreatingByRunnableFunctionalInterface.RevisionRunnable;

public class LambdaBySecondWay implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" this is a run method");
    }

    public static void main(String[] args) {
        Runnable runnable=()-> System.out.println(Thread.currentThread().getName()+" this is a lambda");
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName()+" this is main method");
    }
}
