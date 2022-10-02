package Operators;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= scanner.nextInt();
        System.out.println("Enter the second number");
        int num2= scanner.nextInt();
        System.out.println("The addition of the number is "+Sum.add(num1,num2));
    }

    private static int add(int num1, int nmu2) {
        return num1+nmu2;
    }


}
