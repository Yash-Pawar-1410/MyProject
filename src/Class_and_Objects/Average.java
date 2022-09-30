// Assignment 7
// print the average of three numbers entered by user by  creating a class named 'Average' having a method to calculate and print the average
package Class_and_Objects;

import java.util.Scanner;

public class Average {
    void average(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= sc.nextInt();
        System.out.println("Enter second number");
        int num2= sc.nextInt();
        System.out.println("Enter third number");
        int num3= sc.nextInt();
        int avg=num1+num2+num3/3;
        System.out.println("Average of three number is "+avg);
    }

    public static void main(String[] args) {
        Average average=new Average();
        average.average();
    }
}
