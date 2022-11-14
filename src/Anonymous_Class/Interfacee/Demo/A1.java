package Anonymous_Class.Interfacee.Demo;

public interface A1 {
    void m1();

    public static void main(String[] args) {
        A1 a=new A1() {
            @Override
            public void m1() {
                System.out.println("This is interface ");
            }
        };
        a.m1();
    }
}
