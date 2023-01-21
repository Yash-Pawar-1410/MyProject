package RajshriPractice;

public class Variables {
    int a=10; // instance variable
    static int b=20; // static variable

    public static void main(String[] args) {
        int c = 30; // local variable
        Variables a=new Variables();
        System.out.println(a.a);
        System.out.println(Variables.b);
        System.out.println(c);
    }
}
