package Array.Char_Reverse;

import java.util.Scanner;

public class Usingwhile_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = scanner.nextInt();
        char[] array = new char[size];
        int left = 0;
        int right = size - 1;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the character");
            array[i] = scanner.next().charAt(0);
        }
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("Character in reverse order");
        for (int index = 0; index < size; index++) {
            System.out.println(array[index] + " at index " + index);
        }
    }
}
