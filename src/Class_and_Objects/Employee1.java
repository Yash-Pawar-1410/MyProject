// Assignment 11
// write a by creating class 'Employee' having the following methods and print the final salary
// 1. 'getInfo()' which take the salary , number of hours of work per day of employee as a parameter
// 2. 'AddSal()' which add $10 to salary of the employee if it is less than $500
// 3. 'AddWork()' which add $5 to salary of the employee if the number of hours of work per day is more than 6 hours
package Class_and_Objects;

public class Employee1 {
    int salary;
    int noOfHour;

    void getIngo(int sal, int hr) {
        salary = sal;
        noOfHour = hr;
    }

    void addSal() {
        if (salary < 500) {
            salary = salary + 10;
        }

    }
    void addWork(){
        if (noOfHour>6){
            salary=salary+5;
        }
    }

    public static void main(String[] args) {
        Employee1 employee1=new Employee1();
        employee1.getIngo(454,4);
        employee1.addSal();
        System.out.println(" salary is "+employee1.salary);
        employee1.addWork();
        System.out.println("salary is "+employee1.salary);
    }

}
