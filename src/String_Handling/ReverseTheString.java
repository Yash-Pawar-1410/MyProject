package String_Handling;

public class ReverseTheString {
    public static void main(String[] args) {
        String str ="hello yash";
        char[] ch=str.toCharArray();
        for (int left=0,right=ch.length-1;left<right;right--,left++){
            char temp=ch[right];
            ch[right]=ch[left];
            ch[left]=temp;
        }
        for (char c:ch) {
            System.out.print(c);
        }
    }
}
