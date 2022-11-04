package Anonymous_Class.Interfacee;

public class Main implements A1 {
    @Override
    public void m1() {
        System.out.println("this is override method");
    }
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

