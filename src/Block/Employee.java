package Block;

public class Employee {
    int empId;
    // initialize the value to variable during object creation
    {
        empId=10;
    }
    void display(){
        System.out.println(empId);
    }

    public static void main(String[] args) {
        new Employee().display();
    }
}
