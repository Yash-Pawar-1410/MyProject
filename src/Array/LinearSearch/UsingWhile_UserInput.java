package Array.LinearSearch;

import java.util.Scanner;

public class UsingWhile_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the values in the array");
            array[i] = scanner.nextInt();
        }
        boolean isPresent = false;
        System.out.println("enter the number, you have to find");
        int num = scanner.nextInt();
        int index = 0;
        while (index< array.length) {
            if (array[index] == num) {
                isPresent = true;
                break;
            }
            index++;
        }
        System.out.println(isPresent ? num + " is present in the array" : num + " is not present in the array");
    }
}
