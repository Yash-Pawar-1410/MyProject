/**    Non-static or inner class      */

package Nested_Class;

public class Demo4 {
    class Inner{
        int a=10;
        static int b=20;

        class NestedInner{
            int a1=30;
            static int b1=40;

            class New{
                static String str ="hello yash";
            }
            class hello{
                int a2=50;
                static String sh="heyy";
            }
        }
        class update{
            static int a3=60;
        }
    }

    public static void main(String[] args) {
       Demo4 demo4=new Demo4();
       Demo4.Inner inner=demo4.new Inner();
        System.out.println(inner.a);
        System.out.println(Demo4.Inner.b);
        Demo4.Inner.NestedInner nestedInner=inner.new NestedInner();
        System.out.println(nestedInner.a1);
        System.out.println(Demo4.Inner.NestedInner.b1);
        System.out.println(Demo4.Inner.NestedInner.New.str);
        Demo4.Inner.NestedInner.hello h1= nestedInner.new hello();
        System.out.println(h1.a2);
        System.out.println(Demo4.Inner.NestedInner.hello.sh);
        System.out.println(Demo4.Inner.update.a3);

    }
}
