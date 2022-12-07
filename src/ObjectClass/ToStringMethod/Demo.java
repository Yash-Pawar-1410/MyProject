package ObjectClass.ToStringMethod;

// it is a method present inside the object class returns a string value which contain
//      - complete class name along with the package name
//      - @
//      - Hexadecimal conversion of the hashcode
// internally it calls the getClass() method which return the complete class name along with the package name
// internally  it calls the hashcode method then by using integer.toHexString() it converted into  hexadecimal value
// toString() method is automatically called whenever we try to print the reference variable
public class Demo {
    public static void main(String[] args) {
        Demo demo=new Demo();
        System.out.println(demo);
        // it is optional to write the toString()
        System.out.println(demo.toString());
    }
}
