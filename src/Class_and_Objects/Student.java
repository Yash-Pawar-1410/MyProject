// Assignment 2
//  create a class name 'Student' with string variable 'name' and integer variable 'roll number' assign the value of the roll number as 2 and that of name
//  as "john" by creating object of the class student
//  assign  and print the roll number , phone number and address of two students having names "sam" and "john" respectively by creating two object of
//  class 'Student'

package Class_and_Objects;

public class Student {
    String name;
    int roll_no;
    int phone_no;
    String address;

    void setInfo(String nam, int roll, int phone, String add){
        name=nam;
        roll_no=roll;
        phone_no=phone;
        address=add;
    }
    void print(){
        System.out.println("Student name is"+" "+name+" "
                            +", roll number is"+" "+roll_no+" "
                            +", phone number is"+" "+phone_no+" "
                            +"and address is"+" "+address);
    }

    public static void main(String[] args) {
        Student student= new Student();
        Student student1= new Student();
        student.setInfo("john",2,9579644,"abc");
        student1.setInfo("sam",3,94654466,"xyz");
        student.print();
        student1.print();
    }
}
