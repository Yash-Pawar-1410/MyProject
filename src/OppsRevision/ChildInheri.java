package OppsRevision;

public class ChildInheri extends Inheri{

    @Override
    void m1() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Inheri parentRef=new ChildInheri();
        parentRef.m1();
    }
}
