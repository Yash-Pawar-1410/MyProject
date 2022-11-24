package InterviewProgram;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 12;
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? num + " is a prime number" : num + " is not a prime number");
    }
}
