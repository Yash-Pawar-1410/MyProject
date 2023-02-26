package ExceptionHandling;

public class FinallyNotExecute {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("plz do not try division by using zero");
            System.exit(0);
        }finally {
            System.out.println("finally");
        }
    }
}
