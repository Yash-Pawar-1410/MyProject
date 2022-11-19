package Array.Char_Reverse;

import java.util.Scanner;

public class UsingFor_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        char[] array = new char[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the character");
            array[i] = sc.next().charAt(0);
        }
        for (int left = 0, rigth = size - 1; left < rigth; left++, rigth--) {
            char temp = array[left];
            array[left] = array[rigth];
            array[rigth] = temp;
        }
        System.out.println("Character in reverse order");
        for (int index = 0; index < size; index++) {
            System.out.println(array[index] + " at index " + index);
        }
    }
}
