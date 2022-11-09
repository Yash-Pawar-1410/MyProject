package Call_By_Value;

public class Subtraction {
    public static void main(String[] args) {
        int a=70;
        int b=30;
        System.out.println(Sub(a,b));
        System.out.println(a);
        System.out.println(b);
    }

    private static int Sub(int a, int b) {
        a=100;
        b=50;
        //---------------------------
        a=500;
        b=250;
        return a-b;
    }
}
