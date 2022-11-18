package Array.Demo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a1= sc.nextInt();
        int a[]=new int[a1];
        for (int i = 0; i <a1 ; i++) {
            System.out.println("Enter the value for index "+i);
            a[i]=sc.nextInt();
        }
        for (int j = 0; j <a1 ; j++) {
            System.out.println("Value of index "+j+" is "+a[j]);
        }
    }
}
