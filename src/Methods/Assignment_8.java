// write a program which will ask the user to enter his/her marks ( out of 100) define a method that will display grades according to marks entered as below
/*
            Marks        Grade
            91-100         AA
            81-90          AB
            71-80          BB
            61-70          BC
            51-60          CD
            41-50          DD
             <=40          Fail
 */
package Methods;

import java.util.Scanner;

public class Assignment_8 {
    void marks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int mark = scanner.nextInt();
        if (mark <= 40) {
            System.out.println("fail");
        } else if (mark > 41 && mark < 50) {
            System.out.println("DD");
        } else if (mark > 51 && mark < 60) {
            System.out.println("CD");
        } else if (mark > 61 && mark < 70) {
            System.out.println("BC");
        } else if (mark > 71 && mark < 80) {
            System.out.println("BB");
        } else if (mark > 81 && mark < 90) {
            System.out.println("AB");
        } else if (mark > 91 && mark < 100) {
            System.out.println("AA");
        }
    }

    public static void main(String[] args) {
        Assignment_8 assignment_8 = new Assignment_8();
        assignment_8.marks();
    }
}
