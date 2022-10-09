/**  Parameterized Constructor.Constructor   */
package Constructor;

public class Demo2 {
    int studInd;
    String studName;
    static String clg="JaiHind";

    public Demo2(int id,String name){
        studInd=id;
        studName=name;
        System.out.println("student id is "+studInd+", student name is "+studName+" and college name is "+clg);
    }

    public static void main(String[] args) {
        Demo2 demo=new Demo2(121,"Yash");
        Demo2 demo1=new Demo2(122,"Neha");
        Demo2 demo2=new Demo2(123,"Kunal");


    }
}
