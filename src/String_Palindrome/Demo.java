package String_Palindrome;

public class Demo {
    public static void main(String[] args) {
        String string = "HelleH";
        StringBuffer stringBuffer=new StringBuffer(string);
        stringBuffer.reverse();
        String str=stringBuffer.toString();
        System.out.println(string.equals(str)?"It is palindrome":"It is not palindrome");

    }
}
