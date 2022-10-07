package Nested_Class;

public class Demo1 {


    static class m1 {
        String a = "yash";
        static int b = 20;

        static class abc {
            static int b1 = 120;
            static String b2 = "it is a b1";

            static class hello {

                int a = 10;
                int b = 50;
            }

            static class xyz {
                int c = 10;
                int d = 22;
                int sum = c + d;
            }

            static class mn {
                static String s = "hello";
            }
        }
    }

    void h1() {
        System.out.println("this is new method");
    }

    public static void main(String[] args) {
        Demo1.m1 d = new Demo1.m1();
        System.out.println(d.a);
        System.out.println(Demo1.m1.b);
        System.out.println(Demo1.m1.abc.b1);
        System.out.println(Demo1.m1.abc.b2);
        Demo1.m1.abc.hello abc = new m1.abc.hello();
        System.out.println(abc.a);
        System.out.println(abc.b);
        Demo1.m1.abc.xyz bye = new m1.abc.xyz();
        System.out.println(bye.c);
        System.out.println(bye.d);
        System.out.println(bye.sum);
        System.out.println(Demo1.m1.abc.mn.s);
       Demo1 demo1=new Demo1();
       demo1.h1();
    }
}
