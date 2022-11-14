package Access_Modifier;

public class Rev {
    int a;
    int b;
    int c;
    int d;
    int m1(int a){
        return a;
    }
    public int m2(int b){
        return b;
    }
    private int m3(int c){
        return c;
    }
    protected int m4(int d){
        return d;
    }

    public static void main(String[] args) {
        Rev rev=new Rev();
        System.out.println(rev.m1(10));
        System.out.println(rev.m2(20));
        System.out.println(rev.m3(30));
        System.out.println(rev.m4(40));
    }
}
