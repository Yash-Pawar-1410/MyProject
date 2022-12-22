package Multithreading.CreatingByThreadClass;

public class Demo1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Class method");
        }
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.start();
        Demo1 demo11=new Demo1();
        demo11.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " main method");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " again main method");
        }
    }
}
