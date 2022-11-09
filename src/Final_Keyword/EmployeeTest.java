package Final_Keyword;

public class EmployeeTest extends Employee {
    public static void main(String[] args) {
        EmployeeTest employeeTest = new EmployeeTest();
        System.out.println(employeeTest.EmpId);
        System.out.println(employeeTest.EmpMob);
        System.out.println(employeeTest.EmpName);
        //-------------------------------------------------------

        // we take EmpId and EmpMob final that's way we can not reassign the value
        // if we do that we get CTE

//        employeeTest.EmpId=12;
//        employeeTest.EmpMob=6566464;
//        employeeTest.EmpName="Neha";

    }

}
