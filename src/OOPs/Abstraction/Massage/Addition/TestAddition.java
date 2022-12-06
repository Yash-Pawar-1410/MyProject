package OOPs.Abstraction.Massage.Addition;

import java.util.Scanner;

public class TestAddition extends DeclareMethod {

    @Override
    int addition() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        int c=a+b;
        System.out.println("addition is "+c);
        return c;
    }

    public static void main(String[] args) {
      TestAddition testAddition=new TestAddition();
      testAddition.addition();
    }
}
