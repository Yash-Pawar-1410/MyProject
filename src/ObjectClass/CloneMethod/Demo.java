package ObjectClass.CloneMethod;

//it is a method present inside the object class which creates exact copy of the existing object
//java does not provide an automatic mechanism to clone an object
// whenever we assign the reference variable to another reference variable then only reference of the object is copied not contain of the object
//this means that the original and reference copy point to the same object. if we make changes in any one then original values also changes
public class Demo implements Cloneable {
    int a;
    int b;
    Demo (int a, int b){
        this.a=a;
        this.b=b;
    }
    void printValue(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Demo original=new Demo(10,20);
        original.printValue();
        Demo clone=(Demo)original.clone();
        clone.a=30;
        clone.b=40;
        clone.printValue();
        System.out.println(original.hashCode());
        System.out.println(clone.hashCode());
    }
}
