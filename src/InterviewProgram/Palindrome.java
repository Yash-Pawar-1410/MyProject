package InterviewProgram;

public class Palindrome {
    public static void main(String[] args) {
        int num = 454;
        int temp = num;
        int sum = 0;
        int a;
        while (num > 0) {
            a = num % 10;
            sum = (sum * 10) + a;
            num = num / 10;
        }
        System.out.println(temp == sum ? "it is palindrome number" : "it is not palindrome number");
    }
}
