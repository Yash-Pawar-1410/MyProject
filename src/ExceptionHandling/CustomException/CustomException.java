package ExceptionHandling.CustomException;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter two number");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        if (b==0){
            throw new InvalidDivisiorException("divide by 0");
        }
        System.out.println("divsion is "+(a/b));
    }
}
