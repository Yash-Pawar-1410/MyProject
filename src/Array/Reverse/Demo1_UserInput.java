package Array.Reverse;

import java.util.Scanner;

public class Demo1_UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= sc.nextInt();
        int[] array=new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter the values in the array");
            array[i]= sc.nextInt();
        }
        for (int left=0,right=size-1; left<right;left++,right--){
            int temp=array[right];
            array[right]=array[left];
            array[left]=temp;
        }
        System.out.println("---------------------------"+"\n"+"Reverse number is"+"\n"+"---------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]+" at index "+i);
        }
    }
}
