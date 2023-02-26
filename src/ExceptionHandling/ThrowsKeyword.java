package ExceptionHandling;

public class ThrowsKeyword {
    public static void main(String[] args) {
//    m1();
        System.out.println("hello");
    }

    public void m1() throws ArithmeticException {
        System.out.println(10/0);
    }

}
