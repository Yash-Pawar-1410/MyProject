package ExceptionHandling;

public class ExceptionInCatch {
    public static void main(String[] args) {
        try{
            System.out.println("before exception");
            System.out.println(10/0);
            System.out.println("after exception");
        }catch (ArithmeticException arithmeticException){
            System.out.println("divide by zero not allowed");
            System.out.println(10/0);
            System.out.println("after catch exception");
        }finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the code");
    }
}
