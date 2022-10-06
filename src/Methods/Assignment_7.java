// define a method to find out if number is prime or not
package Methods;

import java.util.Scanner;

public class Assignment_7 {
    void prime(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scanner.nextInt();
        boolean isPrime=true;
        for (int i = 2; i <num/2; i++) {
            if (num%2==0 && num!=2){
                isPrime = false;
                break;
            }
        }
        System.out.println((isPrime)? "Prime number" :"not a prime number");
    }

    public static void main(String[] args) {
        Assignment_7 assignment_7=new Assignment_7();
        assignment_7.prime();
    }
}
