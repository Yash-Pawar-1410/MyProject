package OOPs.Abstraction.B;

public abstract class A {

    abstract void m1();
   class Inner{
        void m2(){   // we can not write abstract keyword to inner class instance method
            System.out.println("this is inner class");
            class  LocalInner{
               void m3(){  // we can not write abstract keyword to local inner class instance method
                    System.out.println("this local inner class");
                }

            }
            LocalInner localInner=new LocalInner();
            localInner.m3();
        }
    }
    class StaticClass{
      void m4(){        // we can not write abstract keyword to static  class instance method
          System.out.println("this is static class");
      }
    }
    //abstract static int b=10;              we can not write abstract key word to static variable
    //abstract int a=10;                     we can not write abstract key word to instance variable
    //abstract static void m2();             we can not write abstract keyword to static method

//  abstract  {                                 we can not write abstract keyword to instance block
//        System.out.println("Instance block");
//    }
//    abstract static {                        we can not write abstract keyword to static block
//        System.out.println("Static Block");
//    }
//  abstract A() {                                 we can not write abstract keyword to Zero-parameterize constructor
//        System.out.println("Zero-parameterize constructor");
//    }
//    int id;
//   abstract A(int a){                           we can not write abstract keyword to parameterize constructor
//        id=a;
//        System.out.println("id is " +id);
//    }

}
