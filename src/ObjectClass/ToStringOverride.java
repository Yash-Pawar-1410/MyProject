package ObjectClass;

public class ToStringOverride {
    public static void main(String[] args) {
        Course course=new Course(10,"Advance");
        System.out.println(course.toString());

        course.setCourseId(121);
        course.setCourseName("java");
        System.out.println(course.getCourseId());
        System.out.println(course.getCourseName());

    }
}
