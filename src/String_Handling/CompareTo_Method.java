package String_Handling;

public class CompareTo_Method {
    public static void main(String[] args) {
        String str=new String("Hii");
        String str1=new String("Hii");
        String str2=new String("Hello");

        String str3="Hii";
        String str6="Hii";
        String str4="Hello";
        String str5="bye";

        System.out.println(str.compareTo(str1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str6));
        System.out.println(str6.compareTo(str4));
        System.out.println(str4.compareTo(str5));


    }
}
