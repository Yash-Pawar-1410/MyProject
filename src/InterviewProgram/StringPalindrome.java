package InterviewProgram;

public class StringPalindrome {
    public static void main(String[] args) {
        String mystring = "anna";
        StringBuffer buffer = new StringBuffer(mystring);
        buffer.reverse();
        String data = buffer.toString();
        if (mystring.equals(data)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}
