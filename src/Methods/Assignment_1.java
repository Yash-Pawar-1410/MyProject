// define two methods to print the maximum and minimum number respectively among three number entered by user
package Methods;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Assignment_1 {

    void input(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first no");
        int num1= scanner.nextInt();
        System.out.println("enter second no");
        int num2= scanner.nextInt();
        System.out.println("enter third no");
        int num3= scanner.nextInt();
        if (num1>num2){
            System.out.println("greatest is "+num1);
        } else if (num2>num3) {
            System.out.println("greatest is "+num2);
        } else if (num3>num1) {
            System.out.println("greatest is "+num3);
        }
    }
    void  min(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first no");
        int num1= scanner.nextInt();
        System.out.println("enter second no");
        int num2= scanner.nextInt();
        System.out.println("enter third no");
        int num3= scanner.nextInt();
        if (num1<num2){
            System.out.println("Minimum is "+num1);
        } else if (num2<num3) {
            System.out.println("Minimum is "+num2);
        } else if (num3<num1) {
            System.out.println("Minimum is "+num3);
        }
    }

    public static void main(String[] args) {
        Assignment_1 assignment_1=new Assignment_1();
        assignment_1.input();
        assignment_1.min();
    }
}
