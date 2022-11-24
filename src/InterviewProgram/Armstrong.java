package InterviewProgram;

public class Armstrong {
    public static void main(String[] args) {
        int num = 371;
        int oldNumber = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            sum = sum + (digit * digit * digit);
        }
        System.out.println(oldNumber == sum ? oldNumber + " it is armstrong number" : oldNumber + " it is not armstrong number");
    }
}
