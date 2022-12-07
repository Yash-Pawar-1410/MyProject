package ObjectClass.HashCodeMethod;

// it is a native method present inside the object class which return integer value
// the integer value calculated on the basis of the  actual memory address it is not an actual memory
// we can override the hashcode inside the string class
// Hashing => it is the process of converting the bigger string into the smaller string by using some hash function
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        System.out.println(demo1.hashCode());
    }
}
