//  Define a method to calculate power of a number raised to other i.e. ab
//  using recursion where the numbers 'a' and 'b' are to be entered by the user
package Methods;

import java.util.Scanner;

public class Assignment_14 {
    void power(int a, int b)
    {
        int pow = 1;
        for (int i = 1; i <= b; i++)
            pow *= a;
        System.out.println(pow);

    }


    public static void main(String[] args)
    {
        Assignment_14 assignment_14=new Assignment_14();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        assignment_14.power(a, b);
    }
}





  /*  float tax = 0;
    float tax1 = 0;
    float tax2 = 0;
        if (netTax < 100000) {
        tax = 0;
        System.out.println("tax is " + tax);
        } else if (netTax > 100000 && netTax < 200000) {
        tax1 = (float) (0.10 * grossSalary);
        System.out.println("tax is " + tax1);
        } else if (netTax > 200000 && netTax < 500000) {
        tax2 = (float) (0.20 * grossSalary);
        System.out.println("tax is " + tax2);
        } else if (netTax > 500000) {
        float tax3 = tax + tax1 + tax2 + (float) (0.30 * grossSalary);
        System.out.println("tax is " + tax3);
        }
*/