package Array.LinearSearch;

import java.util.Scanner;

public class UsingWhile1_UserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size= scanner.nextInt();
        int[] array=new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter the value of the array");
            array[i]= scanner.nextInt();
        }
        boolean isPresent=false;
        System.out.println("enter the array, you want to search");
        int num= scanner.nextInt();
        int index=0;
        while (index< array.length){
            if (array[index]==num){
                isPresent=true;
                break;
            }
            index++;
        }
        System.out.println(isPresent?num+" is present in the array at index "+index:num+" is not present in the array");
    }
}
