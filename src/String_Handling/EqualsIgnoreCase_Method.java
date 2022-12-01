package String_Handling;

public class EqualsIgnoreCase_Method {
    public static void main(String[] args) {
        String str=new String("Hii");
        String str1=new String("Hii");
        String str2=new String("Hello");

        String str3="Hii";
        String str6="Hii";
        String str4="Hello";
        String str5="bye";

        // this method also check content of the object
        // it prints true even object are stored in different memory
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.equalsIgnoreCase(str3));
        System.out.println(str2.equalsIgnoreCase(str4));

    }
}
