package String_Handling;


public class ObjectCreation {
    public static void main(String[] args) {
        // we can create the object of a string class in two ways

        // By using new keyword
        // it stored object inside the HEAP memory area
        // Two object are crated one is inside the HEAP and another is inside the SCP
        // It always created an object on every object creation
        String str = new String("New Keyword object");
        String str2 = new String("New Keyword object ");

        // By using literal way

        // it stored object inside the SCP (String Constant Pool)
        // SCP => It is a special memory area created under the HEAP
        // One object are created only inside the SCP
        // It always created one object if same object are present even we created two objects
        String str1 = "literal object ";
        String str3 = "literal object ";
        System.out.println(str);
        System.out.println("Address of str object "+System.identityHashCode(str));
        System.out.println();

        System.out.println(str2);
        System.out.println("Address of str 2 object "+System.identityHashCode(str2));
        System.out.println();

        System.out.println(str1);
        System.out.println("Address of str1 object  "+System.identityHashCode(str1));
        System.out.println();

        System.out.println(str3);
        System.out.println("Address of str3 object "+System.identityHashCode(str3));
        System.out.println();
    }
}
