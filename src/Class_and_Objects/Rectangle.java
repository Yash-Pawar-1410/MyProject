// Assignment 5
// write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating the class named 'Area'
//  which returns the area and length and breadth passed as parameters to its constructors

package Class_and_Objects;

public class Rectangle {
    int length;
    int breadth;
    void setValue(int a,int b){
        length=a;
        breadth=b;
    }
     int area(){
       return length*breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.setValue(4,5);
        System.out.println("the area of the rectangle is "+ rectangle.area());

        Rectangle rectangle1=new Rectangle();
        rectangle1.setValue(5,8);
        System.out.println("the area of the rectangle is "+ rectangle1.area());
    }
}
