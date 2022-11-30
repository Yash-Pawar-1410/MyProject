package Call_By_Value;

public class AddRev {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(Add(a,b));
    }

    private static int  Add(int a,int b) {
        a=100; // it reassigns or replace  the value 10 to 100
        b=200; // it reassigns or replace the value 20 to 200
        return a+b;
    }
}
