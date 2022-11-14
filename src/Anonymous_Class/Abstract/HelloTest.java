package Anonymous_Class.Abstract;

public class HelloTest {
    public static void main(String[] args) {
        Hello hello=new Hello() {
            @Override
            void m1() {
                System.out.println("It is a anonymous class ");
            }
        };
        hello.m1();
        Hello hello1=new HellloImp();
       hello1.m1();
    }
}
