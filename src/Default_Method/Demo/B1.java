package Default_Method.Demo;

public interface B1 {
    void m1();
    default void m2(){
        System.out.println("Default method from the interface 2");
    }
}
