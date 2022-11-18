package Array.Demo;


import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
       /* int b[] = {10, 20, 121, 2230};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        int a[] = new int[5];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println();*/
        //**********************************************************
        // use scanner tho put the array length and print the index of the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int b2 = sc.nextInt();
        int b1[] = new int[b2];

        for (int i1=0; i1 < b2; i1++) {
            System.out.println("Enter the value for index is "+i1 );
            b1[i1] = sc.nextInt();
        }
        for (int i = 0; i < b2; i++) {
            System.out.println("Value is " + b1[i]+" index is " +i);
        }
    }
}

