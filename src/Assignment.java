import java.*;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {


        // Lets Program


// Assignment 1 (Write a program to get the following output " Hey there. I am data!")

        //System.out.println("Hey there. I am data!");

// Assignment 2 ( Write a program to print following on screen   *
//                                                               * *
//                                                               * * *)

        // without for loop
        /*
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        */

        // with loop
        /*
        int i,j,row=3;
        for (i=0; i<row; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
         */

// Assignment 3 (print the following pattern on the screen          *****
        //                                                           ***
        //                                                            *
        //                                                           ***
        //                                                          *****)

        // Without loop
        /*
        System.out.println("*****");
        System.out.println(" ***");
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        */

        // With loop
        /*
        int i,j,k,row=3;
        for (i=0; i<=row-1; i++)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=row-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i=row-2; i>=0; i--)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=row-1; k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
         */



// Assignment 4 (Write a program to print the sum of the numbers 2,4 and 5)
      /*
        int a=2;
        int b=4;
        int c=5;
        int sum;
        sum=a+b+c;
        System.out.println(sum);
       */

//Assignment 5 (Write the program to print the difference and product  of the  numbers 45 and 32)
        /*
        int a=45;
        int b=32;
        int difference;
        int product;
        difference=a-b;
        product=a*b;
        System.out.println(difference);
        System.out.println(product);
         */

// Known data type

// Assignment 1 (Write a java program  to print an int, a double and a char on screen)
        //int

        // int a=5;
        // System.out.println(a);


        // double dub=546649.246456d;
        //System.out.println(dub);

        // char gender ='m';
        // System.out.println(gender);

// Assignment 2 (Write a program to print the area of a rectangle of sides  2 and 3 units respectively)
       /*
        int l=2;
        int b=3;
        int area;
        area=l*b;
        System.out.println(area);
        */

// Assignment 3 (Write the program to print the product of the numbers 8.2 And 6)
       /*
        float a=8.2f;
        float b=6;
        float product;
        product= a*b;
        System.out.println(product);
        */


// Assignment 4 (Print the ASCII value of the character 'h')
       /*
        int ch='h';
        System.out.println(ch);
        char ch='h';
        System.out.println((int)ch);
       definition :-
        => In datatype casting it is called widening (Conversion of lowest datatype into highest datatype)
        => and in class casting  it is called upcasting (In oops concept = inheritance)
        int ch=104;
        System.out.println((char)ch);
        Definition :-
        => In datatype casting it is called Narrowing  (Conversion of highest datatype into lowest datatype)
        => and in class casting  it is called down-casting (In oops concept = inheritance)
        */

// Assignment 5 (Write a program to assign a vale of 100.235 to a double variable and then convert it into int)
        /*
        double ch=100.235d;
        System.out.println((int)ch);
         */


// Assignment 6 (Write a program to add 3 to the ASCII value of the cha 'd' and print the equivalent char)

      /*
        int ch='d'+3;
        System.out.println(ch);
        System.out.println((char)ch);

       */


// Assignment 7 (Write a program to add an integer variable having value 5 and a double variable having value 6.2)
        /*
        int a=5;
        double b=6.2d;
        double add;
        add =a+b;
        System.out.println(add);
         */

// Assignment 8 (Write a program to find the square of the number 3.9)
        /*
        float a=3.9f;
        float square;
        square=a*a;
        System.out.println(square);
         */
    }
}
