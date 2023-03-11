package String_Handling;

public class PrintStringInNewLine {

    public static void main(String[] args) {
        String str="yash1,yash2,yash3";
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==',') {
                System.out.println();
            }else
                System.out.print(str.charAt(i));
        }
    }
}
