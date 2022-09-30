package Class_Component;

/*  Q   where it is created
    =>  outside the method, constructor, block without any keyword
    Q   why we use
    =>  to store object specific information
    Q   where they get the memory
    =>  heap memory area
    Q   how do we access them
    =>  we need reference variable ( reference variable.Instance variable name)
    Q   when they get the memory
    =>  after creating object
    Q   when variable are deleted
    =>  when object is destroyed
    Q   how many times get the memory
    =>  every time object is created
    Q   default value
    =>  yes
    Q   do we need object to be created to access them
    =>  yes

*/

public class InstanceVariable {
    int studId;
    String studName;
     void information(){
        System.out.println("Student id is"+"\t"+studId+"\t"+"and student name is"+"\t"+studName);
    }
    public static void main(String[] args) {
        InstanceVariable iv=new InstanceVariable();   // here iv is the reference variable
        iv.studId=15;                                  // studId is instance variable name
        iv.studName="yash";
//        System.out.println(iv.studId);
//        System.out.println(iv.studName);
        iv.information();
    }
}
