package ObjectClass.CloneMethod;

// it is present inside the  object class which create an exact copy/duplicate of the existing object
// java language does not provide an automatic mechanism to clone method
// whenever we assign the reference variable inside the another reference variable then only reference variable is copied not a content of the object
// this mean that original and reference copy point to the same object. if we make changes in either variable, also affect the another
public class Demo1 implements Cloneable{
    int a;
    int b;

    public Demo1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void m1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Demo1 original=new Demo1(20,30);
        original.m1();
        Demo1 clone=(Demo1)original.clone();
        clone.a=50;
        clone.b=70;
        clone.m1();
        System.out.println(original.hashCode());
        System.out.println(clone.hashCode());
    }
}
