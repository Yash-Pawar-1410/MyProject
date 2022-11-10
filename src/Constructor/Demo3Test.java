package Constructor;

public class Demo3Test {
    public static void main(String[] args) {
        Demo3 demo3=new Demo3();
        demo3.m1();
        System.out.println();

        Demo3 demo31=new Demo3(121,"Neha");
        Demo3 demo311=new Demo3(1221,"Harshada");
        demo31.m1();
        System.out.println();
        demo311.m1();
    }
}
