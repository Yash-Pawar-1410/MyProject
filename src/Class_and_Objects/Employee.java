// write a program that would print the information (name, year of joining, salary,address) of three employees by creating a class namedEmployee'
// the output should be as follows
//      name                yoj         salary          address
//      robert              1994        12000           abc
//       sam                200         24000           xyz
package Class_and_Objects;

public class Employee {
    String name;
    int yoj;
    int salary;
    String add;

    void setvalue(String str, int join, int sal, String ad) {
        name = str;
        yoj = join;
        salary = sal;
        add = ad;
    }

    void print() {
        System.out.println(name + "  " + yoj + "  " + salary + "  " + add);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setvalue("robert", 1994, 1200, "abc");
        employee.print();

        Employee employee1 = new Employee();
        employee1.setvalue("sam   ", 2000, 2200, "xyz");
        employee1.print();
    }
}
