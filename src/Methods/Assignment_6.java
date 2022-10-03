// write a program to print the circumference and area of a circle of a radius entered by user by defining your own method
package Methods;

import java.util.Scanner;

public class Assignment_6 {
    void area(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        int radius=scanner.nextInt();
        int area=(22/7)*radius*radius;
        System.out.println("area of a circle is "+area);
    }
    void circumference(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        int radius=scanner.nextInt();
        int circumference=2*(22/7)*radius;
        System.out.println("circumference of a circle is "+circumference);
    }

    public static void main(String[] args) {
        Assignment_6 assignment_6=new Assignment_6();
        assignment_6.area();
        assignment_6.circumference();
    }
}
