package String_Handling;

public class Equals_Method {
    public static void main(String[] args) {
        String str=new String("Hii");
        String str1=new String("Hii");
        String str2=new String("Hello");

        String str3="Hii";
        String str6="Hii";
        String str4="Hello";
        String str5="bye";

        // == checks reference variable and memory location address
        System.out.println(str==str1); // false
        System.out.println(str==str3); // false
        System.out.println(str1==str3); // false
        System.out.println(str3==str6); // true
        System.out.println("************************");

        // equals() checks content of the object
        System.out.println(str.equals(str1)); // true
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str2.equals(str4)); //true
        System.out.println(str3.equals(str6)); // true
        System.out.println(str6.equals(str4));// false
    }
}
