/**   Zero parameterized constructor  */
package Constructor;

public class Demo1 {
    int studId;
    String studName;
    static String clg="JaiHind";

    public Demo1(){
        studId=10;
        studName="yash";

        System.out.println("Student id is "+studId+", student name is "+studName+" and college is "+clg);
    }

    public static void main(String[] args) {
        Demo1 demo1=new Demo1();



    }
}
