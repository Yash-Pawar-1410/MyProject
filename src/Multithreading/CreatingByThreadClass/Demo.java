package Multithreading.CreatingByThreadClass;

public class Demo extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" this is a run method from class");
    }


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" This is main method");
        Demo demo=new Demo();
        demo.start();
    }
}
