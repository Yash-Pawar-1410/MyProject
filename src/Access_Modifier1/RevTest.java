package Access_Modifier1;

import Access_Modifier.Rev;

public class RevTest {
    public static void main(String[] args) {
        Rev rev2=new Rev();
//        System.out.println(rev2.m1(20)); it is a default method, it can be accessed in the same package and same class
        System.out.println(rev2.m2(30));
//        System.out.println(rev2.m3(40)); it is a private method, it can be accessed in same class only
//        System.out.println(rev2.m4(50)); it is a protected method, it can be accessed in same package and same class
    }
}
