// Assignment 4
// write a program to print the area and perimeter of a triangle having sides of 3,4 and 5 units by creating class named 'Triangle' with constructor
// having the three sides as its parameters

package Class_and_Objects;

public class Triangle1 {

        int side;
        int side1;
        int side2;

        void setValue(int sd1, int sd2, int sd3) {
            side = sd1;
            side1 = sd2;
            side2 = sd3;
        }

        int area() {
            return side * side1 * side2;
        }

        int perimeter() {
            return side + side1 + side2;
        }

        public static void main(String[] args) {
            Triangle1 triangle = new Triangle1();
            triangle.setValue(3, 4, 5);
            System.out.println("Area of the triangle is " + triangle.area());
            System.out.println("Perimeter of the triangle is " + triangle.perimeter());


        }
    }


