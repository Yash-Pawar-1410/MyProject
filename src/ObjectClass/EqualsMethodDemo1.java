package ObjectClass;

public class EqualsMethodDemo1 {
    public static void main(String[] args) {
        Student1 student2=new Student1(1,"hello",34);
        Student1 student3=new Student1(1,"hello",34);

        Student1 student4=new Student1(11,"bye");
        Student1 student5=new Student1(11,"bye");

        System.out.println(student2==student3);
        System.out.println(student2==student4);
        System.out.println(student2==student5);
        System.out.println(student2==student2);
        System.out.println(student2.equals(student3));
        System.out.println(student2.equals(student4));
        System.out.println(student2.equals(student5));
        System.out.println(student2.equals(student2));
        System.out.println();


        System.out.println(student3==student2);
        System.out.println(student3==student4);
        System.out.println(student3==student5);
        System.out.println(student3==student3);
        System.out.println(student3.equals(student2));
        System.out.println(student3.equals(student4));
        System.out.println(student3.equals(student5));
        System.out.println(student3.equals(student3));
        System.out.println();

        System.out.println(student4==student2);
        System.out.println(student4==student3);
        System.out.println(student4==student5);
        System.out.println(student4==student4);
        System.out.println(student4.equals(student2));
        System.out.println(student4.equals(student3));
        System.out.println(student4.equals(student5));
        System.out.println(student4.equals(student4));
        System.out.println();

        System.out.println(student5==student2);
        System.out.println(student5==student3);
        System.out.println(student5==student4);
        System.out.println(student5==student5);
        System.out.println(student5.equals(student2));
        System.out.println(student5.equals(student3));
        System.out.println(student5.equals(student4));
        System.out.println(student5.equals(student5));
        System.out.println();

    }
}
