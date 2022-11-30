package Array;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int[] array=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("ENter the element");
            array[i]= sc.nextInt();
        }
        System.out.println("Print the array");
        for (int i = 0; i < size ; i++) {
            System.out.println(  array[i]);
        }

    }
}
