// Print the multiplication table of 15 using recursion

package Methods;

public class Assignment_10 {
    //with method
    int number;

    void getInput(int num) {
        number = num;
    }

    void table() {
        for (int i = 1; i <= 10; i++) {
            int table = number * i;
            System.out.println("Table of " + number + " is " + table);
        }
    }

    public static void main(String[] args) {
        Assignment_10 assignment_10 = new Assignment_10();
        assignment_10.getInput(15);
        assignment_10.table();
    }
}
