package Multithreading.CreatingByRunnableFunctionalInterface;

public class ByPassingRunnablePaarameter implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Class");
        }
    }

    public static void main(String[] args) {
        ByPassingRunnablePaarameter byPassingRunnablePaarameter=new ByPassingRunnablePaarameter();
        Thread thread1=new Thread(byPassingRunnablePaarameter);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("Anonymous class");
                }
            }
        });
        thread.start();
        thread1.start();
        thread1.setName("Hello");
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" Main method");
        }

    }
}
