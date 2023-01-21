package Multithreading.CreatingByRunnableFunctionalInterface.RevisionRunnable;

public class LambdaByFirstWay implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" this is a run method");
    }

    public static void main(String[] args) {
        Thread thread=new Thread(()-> System.out.println(Thread.currentThread().getName()+" This is lambda"));
        thread.start();
        System.out.println(Thread.currentThread().getName()+" this is a main method");
    }
}
