/** Create a class WageEmployee extending Employee class with attributes as hrs (int) and rate (int) and method computeSalary() to
 *  Calculate the salary. Print the salary and details of WageEmployee
 *  (Note :- use the previous data and employee classes Accept the value from the user, Default, Parameterised Constructor and to String()
 *  to be written in all the classes */


package Inheritance.Assignment_2;

import java.util.Scanner;

public class Employee {
   private int hours;
   private int rate;

   Employee(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of hours ");
       int hours= sc.nextInt();
       System.out.println("Enter the the rate of per hour");
       int rate= sc.nextInt();
       this.hours=hours;
       this.rate=rate;
   }
    void computeSalary(){
        int salary=this.hours*this.rate;
        System.out.println("Total salary of the empolyee is "+salary);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
