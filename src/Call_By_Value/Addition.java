package Call_By_Value;



public class Addition {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(Add(a,b));
        System.out.println(a);
        System.out.println(b);
    }

    private static int Add(int a, int b) {
        a=100;
        b = 200;
        //-------------------
        a=500;
        b=500;

        return a+b;
    }

}
