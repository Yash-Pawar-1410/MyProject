package InterviewProgram;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        if (num == 0) {
            factorial = 0;
        }
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("factorial of number " + num + " is " + factorial);
    }
}
