package Insertion_In_Array;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30};
        int size = array.length + 1;
        int[] array1 = new int[size];
        int press;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            array1[i] = array[i];
        }
        do {
            System.out.println("enter the element");
            int element = scanner.nextInt();
            array1[array1.length - 1] = element;
            System.out.println("do you want to add more element then press 1");
            press = scanner.nextInt();

        }
        while (press == 1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
