package ExceptionHandling;

public class TryFinally {
    public static void main(String[] args) {
        try{
            System.out.println("before exception");
            System.out.println(10/0);
            System.out.println("after exception");
        }finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the code");
    }
}
