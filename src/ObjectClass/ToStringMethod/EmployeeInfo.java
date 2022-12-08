package ObjectClass.ToStringMethod;

public class EmployeeInfo {
    int employeeId;
    String employeeName;

    public EmployeeInfo(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeId=" + employeeId +","+"\n"+
                "employeeName='" + employeeName + '\'' +
                '}';
    }
}
