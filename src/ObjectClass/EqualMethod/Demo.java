package ObjectClass.EqualMethod;

// it checks the reference or hashcode of the object
// if the reference or hashcode are equal it will return true else return false
// we can override the equal method
// if we override the equal method then always child class method will be call
// when we use equals method in object class then it checks reference
// when we use equals method in string object then it checks contain
public class Demo {
    public static void main(String[] args) {
        Demo demo=new Demo();
        Demo demo1=new Demo();
        System.out.println(demo== demo1); // false
        System.out.println(demo.equals(demo1)); // false

    }
}
