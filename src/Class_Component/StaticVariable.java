package Class_Component;

/*
    Q   where it is created
    =>  outside the method, constructor, block with static keyword
    Q   why we use
    =>  to store common data across all objects
    Q   where they get the memory
    =>  in the class or method memory area
    Q   how do we access them
    =>  we access by the class name ( Class name. static variable name)
    Q   when they get the memory
    =>  when class is loaded into the memory
    Q   when variable are deleted
    =>  when class is unloaded
    Q   how many times get the memory
    =>  only once at the time of class loading
    Q   default value
    =>  yes
    Q   do we need object to be created to access them
    =>  no
 */
public class StaticVariable {
    static int studId;
    static String studName;
    static void information(){
        System.out.println("Student id is"+"\t"+studId+"\t"+"and student name is"+"\t"+studName);
    }
    static void setDimension(int id, String name){
        studId=id;
        studName=name;
    }
    public static void main(String[] args) {
//       StaticVariable.studId=10;
//       StaticVariable.studName="yash";
        StaticVariable.setDimension(101,"yashpawar");
       StaticVariable.information();
    }
}
