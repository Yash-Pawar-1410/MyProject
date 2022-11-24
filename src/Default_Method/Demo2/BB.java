package Default_Method.Demo2;

public interface BB {
    default void m1(){
        System.out.println("This is m1 method from BB");
    }

}
