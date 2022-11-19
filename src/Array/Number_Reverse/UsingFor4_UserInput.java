package Array.Number_Reverse;

import java.util.Scanner;

public class UsingFor4_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value in the array");
            array[i] = scanner.nextInt();
        }
        for (int left = 0, right = size - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        System.out.println("-----------------------------" + "\n" + "Reverse number is" + "\n" + "-----------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " at index " + i);
        }
    }

}
