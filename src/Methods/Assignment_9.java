// write a program to print the factorial of the number by defining the method name 'Factorial' of any number n is represented by n!
//and is equal to 1*2*3*...(n-1)*n
//  4! =4*3*2*1=24
// also
// 1! = 1
// 0! = 0
package Methods;

import java.util.Scanner;

public class Assignment_9 {
    void Factorial(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num= scanner.nextInt();
        int factorial=1;
        if (num==1){
            factorial=0;
        }
        for (int i = 1; i <=num ; i++) {
            factorial *=i;
            System.out.println("the factorial of "+num+"! is "+factorial);
        }
    }

    public static void main(String[] args) {
        Assignment_9 assignment_9=new Assignment_9();
        assignment_9.Factorial();
    }
}
