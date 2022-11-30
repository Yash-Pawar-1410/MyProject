package Constructor;

// it is a special type of method having same name as class name and does not have
//  => any modifier
//  => return type
//  => even void also
//  => it does not accept any parameter
//  => it calls automatically by jvm if developer does not call any constructor
//  => jvm responsible for the default constructor

public class DefaultConstructor {
    int a = 10;
    int b = 20;

    void m1() {
        int sum = a = b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        DefaultConstructor defaultConstructor=new DefaultConstructor();
        defaultConstructor.m1();
    }
}
