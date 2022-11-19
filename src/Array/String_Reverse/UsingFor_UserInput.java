package Array.String_Reverse;

import java.util.Scanner;

public class UsingFor_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String name = sc.nextLine();
        char[] array = name.toCharArray();
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
        }
    }
}
