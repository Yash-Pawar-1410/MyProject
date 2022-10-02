// define a program to find out whether a given number is even or odd
package Methods;

import java.util.Scanner;

public class Assignment_2 {
    void number(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int num= scanner.nextInt();
        if (num %2==0){
            System.out.println("this is the prime number");
        }
        else {
            System.out.println("it is a odd number");
        }
    }

    public static void main(String[] args) {
        Assignment_2 assignment_2=new Assignment_2();
        assignment_2.number();
    }
}
