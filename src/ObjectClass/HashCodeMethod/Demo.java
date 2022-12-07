package ObjectClass.HashCodeMethod;

// it is a native method present inside the object class which returns integer value
// the integer value is calculated based on the actual memory address it is not the actual memory address
// we can override the hashcode inside the string class
// Hashing => it is a process of converting bigger string into smaller string by applying some hash function
public class Demo {
    public static void main(String[] args) {
        Demo demo=new Demo();
        System.out.println(demo.hashCode());
    }
}
