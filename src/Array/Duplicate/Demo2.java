package Array.Duplicate;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= scanner.nextInt();
        int[] array=new int[size];
        boolean found=false;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element in the array");
            array[i]= scanner.nextInt();
        }
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < size; j++) {
                found=true;
                break;
            }
            if (found==true){
                break;
            }
        }
        System.out.println(found?"it is found":"it is not found");
    }
}
