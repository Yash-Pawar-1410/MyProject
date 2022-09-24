/**
 * print the following pattern on the screen             * * * * *
 * * *
 * <p>
 * * *
 * * * * *
 */

package Lets_Program;

public class Assignment_3 {
    public static void main(String[] args) {

// Without for loop
        System.out.println("* * * * *");
        System.out.println("  * * * ");
        System.out.println("    *   ");
        System.out.println("  * * *  ");
        System.out.println("* * * * *");
        System.out.println();

// With for loop
        for (int row = 0; row <= 2; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print(" ");
            }
            for (int space = row; space <= 2; space++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int row = 1; row >= 0; row--) {
            for (int column = 0; column < row; column++) {
                System.out.print(" ");
            }
            for (int space = row; space <= 2; space++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }


    }
}
