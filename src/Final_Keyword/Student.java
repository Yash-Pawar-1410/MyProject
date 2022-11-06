package Final_Keyword;

public final class Student {
    private int rollNumber;
    private String studName;
    public Student(int roll, String name) {
        rollNumber=roll;
        studName=name;
    }
    void m2 (){
        System.out.println(rollNumber);
        System.out.println(studName);
    }
}
