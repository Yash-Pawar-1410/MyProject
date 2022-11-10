package Access_Modifier;

public class RevisionTest {
    public static void main(String[] args) {
        Revision revision2=new Revision();
        revision2.setA(1000);
        revision2.setB(2000);
        // revision2.setC(3000); it is a private => access only in same class
        revision2.setD(4000);
        System.out.println(revision2.getA());
        System.out.println(revision2.getB());
        System.out.println(revision2.getD());
    }
}
