// Assignment 3
//  write the program to print the area and perimeter of a triangle having sides of 3,4 and 5 unit by creating class named 'Triangle' without any parameter
//  in its constructor

package Class_and_Objects;

public class Triangle {
    int side;
    int side1;
    int side2;

    int area() {
        return side * side1 * side2;
    }

    int perimeter() {
        return side + side1 + side2;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side=3;
        triangle.side1=4;
        triangle.side2=5;
        System.out.println("Area of the triangle is " + triangle.area());
        System.out.println("Perimeter of the triangle is " + triangle.perimeter());


    }
}
