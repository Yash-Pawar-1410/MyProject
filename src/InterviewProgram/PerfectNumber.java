package InterviewProgram;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int sumOfFactor = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfFactor += i;
            }
        }
        System.out.println(sumOfFactor == num ? num + " is perfect number" : num + " is not a perfect number");
    }
}
