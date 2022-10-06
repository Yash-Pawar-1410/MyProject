/**
 * Suppose the value if variable 'a' and 'b' are 6 and 8 respectively, Write two programs to swap the values of the two variables
 */
// Without Using third variable

package Operators;

public class Assignment_10_2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        b=b-a;
        a=b+a;
        b=-(b-a);
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
    }
}
