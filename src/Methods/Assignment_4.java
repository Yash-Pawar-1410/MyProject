// write a program to print the sum of the two numbers entered by users by defining your own method

package Methods;

import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {

        System.out.println("sum of the two numbers are "+Assignment_4.sum());
    }

    private static int sum() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=scanner.nextInt();
        System.out.println("enter the second number");
        int b=scanner.nextInt();
        return a+b;

    }
}
