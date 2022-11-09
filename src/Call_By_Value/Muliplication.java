package Call_By_Value;

public class Muliplication {
    public static void main(String[] args) {
        int a=5;
        int b=5;
        System.out.println(a);
        System.out.println(b);
        System.out.println("multiplication 1 is "+multi(a,b));
        a=20;
        b=4;
        System.out.println("multiplication "+multi(a,b));
        System.out.println(a);
        System.out.println(b);
    }

    private static int multi(int a, int b) {
        a=12;
        b=2;
        return a*b;
    }
}
