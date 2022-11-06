package Default_Method.Demo1;

public interface A {
   void m3();
   default void m4(){
       System.out.println("default method m2 from I1");
   }
}
