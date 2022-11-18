package Block;

public class Demo {
    {
        System.out.println("this is a instance block");
        System.out.println("this is a instance block1");
        System.out.println("this is a instance block2");
    }
    static {
        System.out.println("This is static block1");
    }
    static {
        System.out.println("This is static block2");
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        System.out.println(

        );
        Demo demo1=new Demo();
    }
}
