package Default_Method.Demo;

public class Demo1 implements A1, B1 {
      @Override
    public void m1() {
       System.out.println("this is from A1 and meethod is m1");
          A1.super.m2();
          B1.super.m2();
      }

    @Override
    public void m2() {

    }



    public static void main(String[] args) {
     Demo1 demo1 =new Demo1(); // child class reference and child class object
     demo1.m1();
     demo1.m2();
        System.out.println();
     //------------------------------------------------
     A1 a1 =new A1() {  // parent class reference and parent class object
         @Override
         public void m1() {
         }
     };
     a1.m1();
     a1.m2();
     //------------------------------------------------------
        System.out.println();// parent class reference and parent class object
        B1 b1 =new B1() {
            @Override
            public void m1() {
            }
        };
        b1.m1();
        b1.m2();
        //---------------------------------------------------------
        System.out.println(); // parent class reference and child class object
        A1 a11 =new Demo1();
        a11.m1();
        a11.m2();
        //----------------------------------------------------------
        System.out.println(); // parent class reference and child clas object
        B1 i21=new Demo1();
        i21.m1();
        i21.m2();
        //---------------------------------------------------------------
         // I1 i12= new I1()  we get CTE
    }
}
