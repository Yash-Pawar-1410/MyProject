package OOPs.Abstraction.B;

public class Main extends B{
    public static void main(String[] args) {
        A a=new A() {
            @Override
            void m1()
            {
            }
        };

        A a1=new B();
        a1.m1(); // from B class
    A.Inner inner=a.new Inner();
    inner.m2();
    A.StaticClass staticClass= a.new StaticClass();
    staticClass.m4();

    }
}
