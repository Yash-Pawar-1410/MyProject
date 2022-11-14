package Access_Modifier;

public class RevDemo {
    public static void main(String[] args) {
        Rev rev1=new Rev();
        System.out.println(rev1.m1(10));
        System.out.println(rev1.m2(20));
//        System.out.println(rev1.m3(40)); it is a private method, and it can be accessed in same class only
        System.out.println(rev1.m4(50));
    }
}
