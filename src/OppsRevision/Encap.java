package OppsRevision;

public class Encap {
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public static void main(String[] args) {
      Encap encap=new Encap();
      encap.setA(20);
        System.out.println(encap.getA());

    }
}