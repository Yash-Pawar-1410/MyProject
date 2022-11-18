package Array.LinearSearch;

import java.util.Scanner;

public class UsingFor4_Userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        int [] array=new int[size];
        for (int index = 0; index <size ; index++) {
            System.out.println("Enter the value in the array");
            array[index]= sc.nextInt();
        }
        System.out.println("Enter the number to search");
        int num= sc.nextInt();
        boolean isPresent=false;
        for (int i = 0; i <size ; i++) {
            if (array[i]==num){
                isPresent=true;
                break;
            }
        }
        System.out.println(isPresent?"it is present":"it is not present");
    }
}
