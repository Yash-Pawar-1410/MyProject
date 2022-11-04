package Anonymous_Class.Interfacee;

public interface A {
    void m1();

    public static void main(String[] args) {
        A a=new A() {
            @Override
            public void m1() {
                System.out.println("This is interface ");
            }
        };
        a.m1();
    }
}
