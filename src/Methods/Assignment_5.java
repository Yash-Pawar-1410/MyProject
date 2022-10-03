// define a method that return the product of two numbers entered by user
package Methods;

import java.util.Scanner;

public class Assignment_5 {
     void product(){
         Scanner scanner=new Scanner(System.in);
         System.out.println("enter the first number");
         int num1= scanner.nextInt();
         System.out.println("enter the second number");
         int num2= scanner.nextInt();
         int pro=num1*num2;
         System.out.println("product of the two numbers are "+pro);
     }

    public static void main(String[] args) {
        Assignment_5 assignment_5=new Assignment_5();
        assignment_5.product();
    }
}
