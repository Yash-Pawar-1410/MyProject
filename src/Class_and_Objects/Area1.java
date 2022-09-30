//  length and breadth of rectangle are entered through keyboard
package Class_and_Objects;

import java.util.Scanner;

public class Area1 {
    void setDim(){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length");
        int length= sc.nextInt();
        System.out.println("enter the breadth");
        int breadth= sc.nextInt();
        int rca=length*breadth;
        System.out.println("area of the rectangle is "+rca);
    }

    public static void main(String[] args) {
        Area1 area=new Area1();
       area.setDim();

    }
}
