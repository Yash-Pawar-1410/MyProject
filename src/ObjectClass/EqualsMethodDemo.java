package ObjectClass;

public class EqualsMethodDemo {
    public static void main(String[] args) {
        int a=20;
        int b=20;
        int c=10;

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a==a);
        System.out.println(b==b);
        System.out.println(c==c);

        Student student=new Student(10,"yash");
        Student student1=new Student(10,"yash");

        System.out.println(student==student1);
        System.out.println(student.equals(student1));

        System.out.println(student==student);
        System.out.println(student.equals(student));

        System.out.println(student1==student);
        System.out.println(student1.equals(student));

        System.out.println(student1==student1);
        System.out.println(student1.equals(student1));


    }
}
