package LambdaExpression.Demo;

public class Demo {
    public static void main(String[] args) {
        A lambda=(string)->string.toUpperCase();
        System.out.println(lambda.process("hello yashuu"));
    }
}
