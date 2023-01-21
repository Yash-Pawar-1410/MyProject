package Collection;

import java.util.*;

public class EmployeeImp {
    public static void main(String[] args) {
        Employee employee=new Employee(10, "RajshriPractice",320000);
        Employee employee1=new Employee(6,"Yash",393500);
        Employee employee2=new Employee(16,"Neha",353500);
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.forEach(System.out::println);
        System.out.println("sorted employee");
        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);


    }
}
