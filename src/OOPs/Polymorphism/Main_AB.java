package OOPs.Polymorphism;

public class Main_AB {
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        B b=new B();
        b.m1();
        A ab=new B();
        ab.m1();
    }
}
