// Assignment 1
//  write the program to print the area of a rectangle by creating a class named 'Area' having two method
//  first method named as 'setDim' take length and breadth of rectangle as parameters and second method as 'getArea'  returns the area of the rectangle


package Class_and_Objects;


public class Area {
    int length;
    int breadth;

    void setDim(int lg, int bd) {
        length = lg;
        breadth = bd;
    }

    int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area area = new Area();
        area.setDim(4, 5);
        System.out.println("Area of rectangle =" + area.getArea());



    }
}
