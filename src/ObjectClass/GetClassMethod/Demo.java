package ObjectClass.GetClassMethod;

// it is a final and native method
// it returns object of the class called Class
// using class Class reference we can call getName() to get the name of the class along with the package name
// we can not override the getClass method cz it is a native method
public class Demo {
    public static void main(String[] args) {
        Demo demo=new Demo();
        Class classRef=demo.getClass();
        System.out.println(classRef.getName());
    }
}
