package ObjectClass;

public class ToStringMethodDemo {
    public static void main(String[] args) {
        Student student=new Student(1,"hello");
        int hashcode=student.hashCode();
        System.out.println("Decimal hashcode "+hashcode);
        System.out.println(student.hashCode());
        System.out.println("Hexadecimal hashCode "+Integer.toHexString(hashcode));
        System.out.println(student);
        System.out.println(student.toString());


    }
}
