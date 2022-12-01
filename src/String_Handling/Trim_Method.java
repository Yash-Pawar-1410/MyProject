package String_Handling;

public class Trim_Method {
    public static void main(String[] args) {

        String str=new String("      Hello     ");
        String str1="   Hello    java     ";
        System.out.println(str);
        System.out.println("****************************");
        System.out.println(str.trim());
        System.out.println("****************************");

        System.out.println(str1);
        System.out.println("****************************");
        System.out.println(str1.trim());
    }
}
