package Anonymous_Class.Abstract.Demo;

import Anonymous_Class.Abstract.Demo.A;
import Anonymous_Class.Abstract.Demo.B;

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
