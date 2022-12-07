package ObjectClass.ToStringMethod;

// it is method present inside the objet class return the string value which contain
//      - complete class name along with the package name
//      - @
//      - conversion of the hexadecimal value
// it internally calls the getClass() method which return the complete class name along with the package name
// it internally calls the hashcode then by using integer.toHexString it converted into the hexadecimal value
// toSting() method calls automatically whenever we print the reference variable
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        System.out.println(demo1);
//        it is optional to write the toString()
        System.out.println(demo1.toString());
    }
}
