package Anonymous_Class.Abstract;

import Anonymous_Class.Abstract.A;
import Anonymous_Class.Abstract.B;

public class Main {
    public static void main(String[] args) {
        A a=new A() {
            @Override
            void m1() {
                System.out.println("this is main method ");
            }
        };
        a.m1();
        B b=new B();
        b.m1();
        A a1=new B();
        a1.m1();
    }
}
