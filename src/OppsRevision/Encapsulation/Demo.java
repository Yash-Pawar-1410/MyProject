package OppsRevision.Encapsulation;

public class Demo {
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

    }
}
