package ObjectClass;

public class FinalizeDemo {
    public static void main(String[] args) {
        Student stud=new Student(123,"Java");
        Student stud1=new Student(233,"Advance Java");
        Student stud3=new Student(233,"Advance ");
        stud=null;
        stud1=null;
        System.gc();
        System.out.println(stud3.id);
        System.out.println(stud3.name);
    }
}
