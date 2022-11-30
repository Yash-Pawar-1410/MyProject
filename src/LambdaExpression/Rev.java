package LambdaExpression;

public interface Rev {
    String str(String string);
}
class RevImp implements Rev{

    @Override
    public String str(String string) {
        return string.toUpperCase();
    }
}
class RevTest{
    public static void main(String[] args) {
        Rev lambda=(string )-> string.toUpperCase();
        System.out.println(lambda.str("hey yash how are you"));
    }
}
