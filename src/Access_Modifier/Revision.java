package Access_Modifier;

public class Revision {
    int a;
    public int b;
    private int c;
    protected int d;

     void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    private void setC(int c) {
        this.c = c;
    }

    protected void setD(int d) {
        this.d = d;
    }

     int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    private int getC() {
        return c;
    }

    protected  int getD() {
        return d;
    }

    public static void main(String[] args) {
        Revision revision=new Revision();
        revision.setA(10);
        revision.setB(20);
        revision.setC(30);
        revision.setD(40);
        System.out.println(revision.getA());
        System.out.println(revision.getB());
        System.out.println(revision.getC());
        System.out.println(revision.getD());

    }
}
