// write a  program that takes as inout your gross salary  and your total saving and uses another function named taxCalculator() to calculate your tax
// the taxCalculator() function takes as parameter the gross salary as well as the total saving amount
// the tax is calculated as follows
//  1) the saving is deducted from the gross income to calculate the taxable income maximum deduction of saving can be Rs 100,000 even though  the amount
// can be more than this
//  2) For up to 100,000 as taxable income the tax is 0 (Slab 0); beyond 100,000 to 200,000 tax is 10% of the difference above 100,000 (Slab 1);
//  beyond 200,000 up to 500,000 the net tax is the tax calculated from Slab 0 and Slab 1 and then 20% of the taxable income exceeding 200,000
//  (Slab 2); if its more than 500,000, then the tax is tax from Slab 0, Slab 1, Slab 2 and 30% of the amount exceeding 500,000.

package Methods;

import java.util.Scanner;

public class Assignment_15 {
        int grossSalary;
        int saving;
    void getInput(int a, int b){
        grossSalary=a;
        saving=b;
    }
    void taxCalculator() {

        int netTax = grossSalary - saving;
        float tax = 0;
        float tax1 = 0;
        float tax2 = 0;
        float tax3 = 0;
        if (netTax < 100000) {
            tax = 0;
            System.out.println("tax is " + tax);
        } else if (netTax > 100000 && netTax < 200000) {
            tax1 =+tax1 +(float) (0.10 * grossSalary);
            System.out.println("tax is " + tax1);
        } else if (netTax > 200000 && netTax < 500000) {
            tax2 = tax2+(float) (0.20 * grossSalary);
            System.out.println("tax is " + tax2);
        } else if (netTax > 500000) {
            tax3 = tax + tax1 + tax2 + (float) (0.30 * grossSalary);
            System.out.println("tax is " + tax3);
        }
    }

    public static void main(String[] args) {
        Assignment_15 assignment_15=new Assignment_15();
        assignment_15.getInput(400000,50000);
        assignment_15.taxCalculator();


    }

}
