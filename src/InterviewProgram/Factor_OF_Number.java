package InterviewProgram;

public class Factor_OF_Number {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
