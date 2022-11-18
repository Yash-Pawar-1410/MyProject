package Array.LinearSearch;

import java.util.Scanner;

public class UsingFor3_Userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int index= sc.nextInt();
        int[] array=new int[index];
        boolean isPresent=false;
        for (int i = 0; i <index ; i++) {
            System.out.println("enter the values");
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the number to search in array");
        int num= sc.nextInt();
        for (int i = 0; i <index ; i++) {
            if (array[i]==num){
                isPresent=true;
            }
        }
        System.out.println(isPresent?num+" is present ":num+" not present ");
    }
}
