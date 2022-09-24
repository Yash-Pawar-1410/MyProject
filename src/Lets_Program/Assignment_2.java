/**
 * Write a program to print following on screen   *
 *                                                * *
 *                                                * * *
 */


package Lets_Program;

public class Assignment_2 {
    public static void main(String[] args) {

// Without for loop
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println();

// With for loop
        for (int row = 0; row <= 3; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }


    }
}
