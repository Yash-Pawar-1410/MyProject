package Anonymous_Class.Interfacee.Revision;

public class AnonymousClass implements Interface1,Interface2 {

    @Override
    public void m1() {
        System.out.println("Same method from both interface clas");
    }

    public static void main(String[] args) {
        Interface1 interface1=new Interface1() {
            @Override
            public void m1() {
                System.out.println("Interface 1");
            }
        };
        interface1.m1();
        Interface2 interface2=new Interface2() {
            @Override
            public void m1() {
                System.out.println("Interface 2");
            }
        };
        interface2.m1();
        System.out.println("Child class object");
        AnonymousClass anonymousClass=new AnonymousClass();
        anonymousClass.m1();
    }
}
