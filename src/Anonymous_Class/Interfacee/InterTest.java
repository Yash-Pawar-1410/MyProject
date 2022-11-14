package Anonymous_Class.Interfacee;

public class InterTest implements Inter,Inter1 {
    public static void main(String[] args) {
        Inter inter=new Inter() {
            @Override
            public void m1() {
                System.out.println("this is inter anonymous class ");
            }
        };
        inter.m1();
    Inter1 inter1=new Inter1() {
        @Override
        public void m2() {
                System.out.println("this is inter1 anonymous class ");
        }
    };
    inter1.m2();
    }

    @Override
    public void m1() {
        System.out.println("This is a inter method");
    }

    @Override
    public void m2() {

        System.out.println("This is a inter1 method");
    }
}
