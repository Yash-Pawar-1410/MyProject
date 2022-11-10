package Constructor;

public class Demo3 {
    int empId;
    String empName;
    static String company;
    static int companyId;
    static {
        company="Accenture";
        companyId=13465;
    }

    public Demo3(){
        empId=10;
        empName="Yash";
    }
    public Demo3(int id,String name){
        empId=id;
        empName=name;
    }
    void m1(){
        System.out.println("Emp id is "+empId);
        System.out.println("Emp name is "+empName);
        System.out.println("Company name is "+company);
        System.out.println("Compnay id is "+companyId);
    }
}
