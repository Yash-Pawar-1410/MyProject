/**
 * Local inner class
 */
package Nested_Class;

public class Demo5 {
    void m1() {
        class Local {
            String str = "hello";
            //  static c=30; we get compile time error
            int a = 10;
            int b = 20;
            int sum = a + b;

            static void m2() {
                System.out.println("this is static method");
            }
        }
        Local local = new Local();
        System.out.println(local.str);
        System.out.println(local.a);
        System.out.println(local.b);
        System.out.println(local.sum);
        Local.m2();
    }

    static void m3() {
        class Inner {
            String str1 = "Yash";
            int a1 = 20;
            static int b1 = 30;

            void m4() {
                System.out.println("this is instance method");
            }
        }
        Inner inner = new Inner();
        System.out.println(inner.str1);
        System.out.println(inner.a1);
        System.out.println(Inner.b1);
        inner.m4();
    }

    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        demo5.m1();
        Demo5.m3();
    }
}
