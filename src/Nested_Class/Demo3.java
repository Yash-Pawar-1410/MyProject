/**    access together all nested class   */
package Nested_Class;

public class Demo3 {
    static class hello {
        int a = 10;
        static int b = 10;

        void m1() {
            System.out.println("hello1");
        }
        static void m2() {
            System.out.println("hello2");
        }
    }
    class Inner {

        int b1 = 20;
        void m3() {
            System.out.println("instance method");
        }

    }

    void m4() {
        class LocalInner {
            int a2 = 10;
            //static b2=2; we get compile time error
            void m5(){
                System.out.println("instance method");
            }

        }
        LocalInner localInner=new LocalInner();
        System.out.println(localInner.a2);
        localInner.m5();


    }
    public static void main(String[] args) {
        Demo3.hello demo3=new Demo3.hello();
        System.out.println(demo3.a);
        System.out.println(Demo3.hello.b);
        demo3.m1();
        Demo3.hello.m2();

        Demo3 demo =new Demo3();
        Demo3.Inner inner =demo.new Inner();

        System.out.println(inner.b1);

        inner.m3();

        demo.m4();
    }
}
