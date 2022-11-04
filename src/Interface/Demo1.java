package Interface;

public class Demo1 implements Demo{

    @Override
    public void m1() {
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("sum of the number is "+sum);
    }

    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        demo1.m1();
        Demo dem=new Demo1();
        dem.m1();
    }
}
