package ExceptionHandling;

public class ExceptionHandler {
    public static void main(String[] args) {
        try {
            System.out.println("before exception");
            System.out.println(10/0);
            System.out.println("after exception");

        }catch (ArithmeticException arithmeticException){
            System.out.println("divide by zero no allowed");
        }
        System.out.println("rest  of the code");
    }
}
