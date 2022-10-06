// create a class to print the area of a square and a rectangle
// the class has two methods with the same name but different number of parameter
// the method for printing area of  rectangle has two parameters which are length and breadth respectively while the other method for
// printing area of square has one parameter which is side of square
package Methods;

public class Assignment_18 {
    void area(int length, int breadth){
        int rectArea=length*breadth;
        System.out.println("Area of the rectangle is "+rectArea);
    }
    void area(int side){
        int areaSquare=4*side;
        System.out.println("Area of the square "+areaSquare);
    }

    public static void main(String[] args) {
        Assignment_18 assignment_18 =new Assignment_18();
        assignment_18.area(14,15);
        assignment_18.area(5);
    }
}
