package ObjectClass.EqualMethod;

// it checks the reference or hashcode of the object
// if the reference or hashcode are equals then it will be return true else it returns false
// we can override the equal method
// if we override the equal method then always child class method will be call
// if we use equal method in object class then object reference will be checked
// if we use equal method in string object then object contain checked
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        Demo1 demo2=new Demo1();
        System.out.println(demo1.equals(demo2)); // false
        demo1=demo2;
        System.out.println(demo1.equals(demo2)); // true
    }
}
