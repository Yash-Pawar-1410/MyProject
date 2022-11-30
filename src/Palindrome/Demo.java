package Palindrome;

public class Demo {
    public static void main(String[] args) {
        int num=121;
        int temp=num;
        int sum=0;
        while (num>0){
            int a=num%10;
            sum=(sum*10)+a;
            num=num/10;
        }
        System.out.println(temp==sum?"it is palindrome":"it is not palindrome");
    }
}
