package Array.Number_Reverse;

import java.util.Scanner;

public class UsingWhile_UserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= scanner.nextInt();
        int[] array=new int[size];
        int left=0;
        int right=size-1;
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter the values in the array");
            array[i]=scanner.nextInt();
        }
        while (left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse of the array");
        for (int index = 0; index < size; index++) {
            System.out.println(array[index]+" at index "+index);
        }
    }
}
