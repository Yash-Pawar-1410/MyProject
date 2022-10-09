/**  access together all nested class */
package Nested_Class;

public class Demo2 {
    int a = 100;
    static int b = 200;

    //nested class : static nested class
    static class StaticNestedClass {
        int c = 300;
        static int d = 400;
    }

    //nested class : Non-static or inner clas
    //object specific : we can't have static members inside the inner class
    class Inner {
        int e = 500;
    }

    void m1() {
        //local inner class : can't have static members
        class LocalInner {
            int localvar = 600;
        }
        LocalInner localInner = new LocalInner();
        System.out.println(localInner.localvar);
        int a = 50;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        System.out.println(demo2.a);
        System.out.println(Demo2.b);
        StaticNestedClass abc = new StaticNestedClass();
        System.out.println(abc.c);
        System.out.println(StaticNestedClass.d);
        Demo2.Inner inner = demo2.new Inner();
        System.out.println(inner.e);
        demo2.m1();
    }
}
