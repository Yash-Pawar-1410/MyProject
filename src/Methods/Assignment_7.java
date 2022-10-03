// define a method to find out if number is prime or not
package Methods;

import java.util.Scanner;

public class Assignment_7 {
    void prime(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scanner.nextInt();
        if (num%2==0){
            System.out.println("it is a prime number");
        }
        else {
            System.out.println("it is not prime number");
        }
    }

    public static void main(String[] args) {
        Assignment_7 assignment_7=new Assignment_7();
        assignment_7.prime();
    }
}
