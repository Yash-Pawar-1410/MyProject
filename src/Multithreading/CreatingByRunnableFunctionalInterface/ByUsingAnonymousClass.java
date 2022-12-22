package Multithreading.CreatingByRunnableFunctionalInterface;

public class ByUsingAnonymousClass implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Class");
        }
    }

    public static void main(String[] args) {
        ByUsingAnonymousClass byUsingAnonymousClass = new ByUsingAnonymousClass();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Anonymous class");
                }
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(byUsingAnonymousClass);
        Thread thread2 = new Thread(byUsingAnonymousClass);
        thread1.start();
        thread2.start();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Main");
        }
    }
}
