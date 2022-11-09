package Final_Keyword;

public class StudentTest  {
    public static void main(String[] args) {
        final Student student = new Student(10, "yash");
        //student=new Student(12,"hello"); get CTE Cannot assign a value to final variable 'student'
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println();
        //-----------------------------------------------------------
        System.out.println(" we change the value by object it points");
        student.id = 11;
        student.name = "neha";
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println();
        //-----------------------------------------------------------
        System.out.println("again we change the value by object it points");
        student.id = 12;
        student.name = "Harshada";
        System.out.println(student.id);
        System.out.println(student.name);
    }

}
