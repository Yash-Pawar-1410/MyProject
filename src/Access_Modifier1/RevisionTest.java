package Access_Modifier1;

import Access_Modifier.Revision;

public class RevisionTest {
    public static void main(String[] args) {
        Revision revision1=new Revision();
      // revision1.setA(100); it is default => access in the same package
       revision1.setB(100);
       //revision1.setC(100); it is private => access in the same class
      // revision1.setD(100); it is protected => access in the same package
        System.out.println(revision1.getB());
    }
}
