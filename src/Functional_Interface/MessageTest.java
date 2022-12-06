package Functional_Interface;

public class MessageTest implements MessageDeclare{

    @Override
    public void m1(String str, String str1) {
        System.out.println("yash");
    }

    public static void main(String[] args) {
        // by using traditional way
        // parent class reference and child class object
        MessageDeclare messageDeclare=new MessageTest();
        messageDeclare.m1("a","b");

        // by using anonymous class
        // parent class reference and parent class object
        MessageDeclare messageDeclare1=new MessageDeclare() {
            @Override
            public void m1(String str, String str1) {
                System.out.println("Hello ");
            }
        };
        messageDeclare1.m1("x","y");
        // by using lambda expression
        MessageDeclare lambda=(str, str1) -> System.out.println("How are you");
        lambda.m1("A","B");
    }
}
