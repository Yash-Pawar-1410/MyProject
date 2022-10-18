package OOPs.Encapsulation;

public class Employee {
    private int empId;
    private String empName;
    private long empMobNum;
    {
        System.out.println("This is information about the employee");
    }

    public void setValue (int empId,String empName,long empMobNum) {
        this.empId = empId;
        this.empName = empName;
        this.empMobNum = empMobNum;
    }



    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public long getEmpMobNum() {
        return empMobNum;
    }

    public static void main(String[] args) {
        System.out.println();
        Employee employee=new Employee();
        employee.setValue(16234,"Yash Pawar",9158873806l);
        System.out.println(employee.empId);
        System.out.println(employee.empName);
        System.out.println(employee.empMobNum);

        System.out.println();

        Employee employee1=new Employee();
        employee1.setValue(39468,"Neha",694552896l);
        System.out.println(employee1.empId);
        System.out.println(employee1.empName);
        System.out.println(employee1.empMobNum);
    }
}
