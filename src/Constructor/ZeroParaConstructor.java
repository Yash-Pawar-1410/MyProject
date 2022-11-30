package Constructor;

// it is special type of method having same name as class  name  and does not have any
// => modifier
// => return type even void also
// => it dopes not accept any parameter
// => developer responsible for Zero Para. Constructor

public class ZeroParaConstructor {
    int a;
    int b;
    ZeroParaConstructor(){
        a=110;
        b=220;
    }
    void m1(){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
      ZeroParaConstructor zeroParaConstructor=new ZeroParaConstructor();
      zeroParaConstructor.m1();
    }
}
