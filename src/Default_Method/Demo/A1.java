package Default_Method.Demo;

public interface A1 {
    void m1();
    default void m2(){
        System.out.println("Default method from the interface 1");
    }
}
