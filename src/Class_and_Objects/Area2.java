// Assignment 6
// 1. write a program to print the area of a rectangle by creating class named 'Area' taking the values of its length and breadth as parameter of its
//  constructor and having method named 'returnArea' which returns the area of the rectangle
// 2. length and breadth of rectangle are entered through keyboard

package Class_and_Objects;

import java.util.Scanner;


public class Area2 {
    int length;
    int breadth;

    void returnArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("area of the rectangle is " + area);
    }

    public static void main(String[] args) {
        Area2 area2 = new Area2();
        area2.returnArea();
    }
}
