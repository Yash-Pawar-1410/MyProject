package ExceptionHandling;

public class ThrowsKeywordImpl {
    public static void main(String[] args) {
    ThrowsKeyword throwsKeyword=new ThrowsKeyword();
    try {
        throwsKeyword.m1();
    }catch (ArithmeticException arithmeticException){
        System.out.println("exception handled by method caller");
    }
    }
}
