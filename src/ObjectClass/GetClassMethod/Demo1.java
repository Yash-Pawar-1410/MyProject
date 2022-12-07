package ObjectClass.GetClassMethod;

// it is a final and native  method
// it returns the object of the class called Class
// using Class class-reference we can call the getName method to get the name of the class along with the package name
// we can not override the getClass() method cz it is a fina method
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        Class classRef = demo1.getClass();
        System.out.println(classRef.getName());
    }
}
