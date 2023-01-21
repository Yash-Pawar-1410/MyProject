package Multithreading.CreatingByRunnableFunctionalInterface.RevisionRunnable;

public class RegularWay implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <20 ; i++) {

            System.out.println(Thread.currentThread().getName()+" This is a run method");
        }
    }

    public static void main(String[] args) {
        RegularWay regularWay=new RegularWay();
        Thread thread=new Thread(regularWay);
        thread.start();
        for (int i = 1; i <20 ; i++) {

            System.out.println(Thread.currentThread().getName()+" This is a main method");
        }
    }
}
