/**If the marks of robert in three subjects are 78,45 and 62 respectively (each out of 100). write a program to calculate his total marks
 * and percentage marks */

package Operators;

public class Assignment_9 {
    public static void main(String[] args) {
     int mark1=78;
     int mark2=45;
     int mark3=62;
     float sum=mark1+mark2+mark3;
     float per=(sum/300)*100;
        System.out.println("total marks of robert is "+sum);
        System.out.println("percentage of the robert is "+per);
    }
}
