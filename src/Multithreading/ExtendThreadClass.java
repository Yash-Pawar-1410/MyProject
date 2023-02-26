package Multithreading;

public class ExtendThreadClass extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {

            System.out.println("override run method "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {

            System.out.println("main method "+Thread.currentThread().getName());
        }
        ExtendThreadClass extendThreadClass=new ExtendThreadClass();
        extendThreadClass.setName("hello"); // set name to the thread
        extendThreadClass.start();
    }
}
