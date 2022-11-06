package Default_Method.Demo1;

public class Demo implements A,B {
    @Override
    public void m3() {
        System.out.println("this is a abstract method");
    }

    @Override
    public void m4() {
        B.super.m4();
        A.super.m4();
    }


    public static void main(String[] args) {
        A a=new A() {
            @Override
            public void m3() {

            }
        };
        a.m3();
        a.m4(); // execute this method only
        System.out.println();

        B b=new B() {
            @Override
            public void m3() {

            }
        };
        b.m3();
        b.m4();// execute this method only
        System.out.println();

        Demo demo=new Demo();
        demo.m3();
        demo.m4();
        System.out.println();

        A a1= new Demo();
        a1.m3();
        a1.m4();
        System.out.println();


        B B =new Demo();
        B.m3();
        B.m4();


    }

}
