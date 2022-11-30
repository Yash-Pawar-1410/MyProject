package Constructor;

// it is a special type of method having same name as class name but does not have any
// => modifier
// => return type even void also
// => it accepts parameters
// => developer responsible for para constructor
public class ParaConstructor {
    int a;
    int b;
    ParaConstructor(int a,int b){
        this.a=a;
        this.b=b;
    }
    void m1(){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        ParaConstructor paraConstructor=new ParaConstructor(20,20);
        paraConstructor.m1();
    }
}
