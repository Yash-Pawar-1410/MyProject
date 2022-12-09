package OppsRevision.Encapsulation;

// What is Encapsulation => it is a process of binding the data members and method inside the single unit
// Why we use Encapsulation => we use Encapsulation to better control on data and for data security
// How to implement Encapsulation => first we make the data members private and access them by using public getters and setters
// Real life example => bag ( we put different type of things inside the bag like cloths, charger, bottle )


public class EmployeeInfo {
    private int empId;
    private String empName;
    final String companyName="Cyber Success";

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public static void main(String[] args) {
        EmployeeInfo employeeInfo=new EmployeeInfo();
        employeeInfo.setEmpId(1220);
        employeeInfo.setEmpName("Yash Pawar");
        System.out.println("Employee id is "+employeeInfo.getEmpId());
        System.out.println("Employee name is "+employeeInfo.getEmpName());
        System.out.println("Employee company is "+employeeInfo.getCompanyName());
    }
}
