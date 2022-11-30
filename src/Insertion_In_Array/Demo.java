package Insertion_In_Array;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array={10,20,30};
        int size= array.length+1;
        int[] array1=new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            array1[i]=array[i];
        }
        System.out.println("enter the element");
        int element=scanner.nextInt();
        array1[array1.length-1]=element;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
