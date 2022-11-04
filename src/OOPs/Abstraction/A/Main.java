package OOPs.Abstraction.A;

import OOPs.Abstraction.A.A;
import OOPs.Abstraction.A.B;

public class Main extends B {
    public static void main(String[] args) {
       // A a=new A(); we can not create parent class object if you do that then we get compile time error
        B b=new B();
       b.m1("hi");
        A ab=new B();
        ab.m1("Hello");

    }
}
