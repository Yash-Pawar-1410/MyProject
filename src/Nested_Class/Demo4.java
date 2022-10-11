/**    Non-static or inner class      */

package Nested_Class;

public class Demo4 {
    class Inner{
        int a=10;


        class NestedInner{
            int a1=30;

            }
            class hello{
                int a2=50;

            }
        }



    public static void main(String[] args) {
       Demo4 demo4=new Demo4();
       Demo4.Inner inner=demo4.new Inner();
        System.out.println(inner.a);

        Demo4.Inner.NestedInner nestedInner=inner.new NestedInner();
        System.out.println(nestedInner.a1);


    }
}
