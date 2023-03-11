package Array.String_Reverse;

public class PrintStingInNewLine {
    public static void main(String[] args) {
        String str ="hello1, hello2, hello3";
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==','){
                System.out.println();
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }

}
