package Default_Method.Demo1;

public interface B {
    void m3();
    default void m4(){
        System.out.println("default method m2 from I2");
    }
}
