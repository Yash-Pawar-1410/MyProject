package Multithreading.CreatingByRunnableFunctionalInterface.RevisionRunnable;

public class ByPassingRunnableParameter implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" This is run method");
    }

    public static void main(String[] args) {
        Runnable runnable=()-> System.out.println(Thread.currentThread().getName()+" This is lambda ");
        Thread thread=new Thread(runnable);
        thread.start();
        ByPassingRunnableParameter byPassingRunnableParameter=new ByPassingRunnableParameter();
        Thread thread1=new Thread(byPassingRunnableParameter);
        thread1.start();
        System.out.println(Thread.currentThread().getName()+" This is a main method");
    }
}
