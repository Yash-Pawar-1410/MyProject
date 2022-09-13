import java.*;
import java.util.Scanner;
public class MyProgram {
    public static void main(String[] args) {


        // Simple Print
        // System.out.println("hello, how are you");

        // Print using user input
        /*
        String name;
        Scanner sc= new Scanner(System.in);
        name=sc.nextLine();
        System.out.println(name);
        */


        // Simple addition
        /*
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
        */


        // Addition using user input
        /*
        int a,b;
        int sum,sum1,sum2,sum3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num.");
        a= sc.nextInt();
        System.out.println("Enter the second num.");
        b= sc.nextInt();
        sum=a+b;
        sum1=a-b;
        sum2=a/b;
        sum3=a*b;
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        */


        // Simple avg and percentage
        /*
        int a=10;
        int b=25;
        int c=65;
        float totalAdd;
        float avg;
        float percent;
        totalAdd=a+b+c;
        System.out.println("The addition of the number is :" +totalAdd);
        avg=totalAdd/3f;
        System.out.println("The addition of the number is :" +avg);
        percent=(totalAdd/300)*100f;
        System.out.println("Percentage of the four subject is :" +percent);
*/


        // avg and percentage using user input
        /*
        int a, b, c, d;
        float totalAdd;
        float avg;
        float percent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four subjects marks");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        totalAdd = a + b + c + d;
        System.out.println("Addition of the four subject :" + totalAdd);
        avg = totalAdd / 4f;
        System.out.println("Average of the four subject is :" + avg);
        percent = (totalAdd / 400) * 100f;
        System.out.println("Percentage of the four subject is :" + percent);
        */

        // Simple interest
        /*
        int principalAmount=10000;
        int rate=10;
        int time=6;
        float simpleInterest;
        float totalAmount;
        simpleInterest=(principalAmount*rate*time)/100f;
        System.out.println("Simple interest is :"+simpleInterest);
        totalAmount=principalAmount+simpleInterest;
        System.out.println("Total amount is:"+totalAmount);
         */

        // Simple interest using user input

       /*
        int principalAmount;
        int percentageRate;
        float time;
        float simpleInterest;
        float totalAmount;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the principal amount");
        principalAmount= sc.nextInt();
        System.out.println("Enter the percentage rate");
        percentageRate= sc.nextInt();
        System.out.println("Enter the time (In months)");
        time=sc.nextFloat();
        simpleInterest=(principalAmount*percentageRate*time)/100;
        System.out.println("Simple interest is"+simpleInterest);
        totalAmount=principalAmount+simpleInterest;
        System.out.println("Total amount is"+totalAmount);
        */

// STRING METHODS


        String name="Yash Pawar";
        //System.out.println(name.length());              // 10
        //System.out.println(name.toLowerCase());         //yash pawar
        //System.out.println(name.toUpperCase());         //YASH PAWAR
        //String chs="    Yash Pawar   ";
        //System.out.println(chs.trim());                  // Yash Pawar
        //System.out.println(name.substring(1));           //ash Pawar
        //System.out.println(name.substring(2,6));         //sh P
        //System.out.println(name.replace('Y','P'));        //Pash Pawar
        //System.out.println(name.startsWith("Ya"));        // it gives true
        //System.out.println(name.startsWith("pa"));        // it gives false
        //System.out.println(name.endsWith("ar"));          // it gives true
        //System.out.println(name.endsWith("pa"));          // it gives false
        //System.out.println(name.charAt(2));               //s
        //System.out.println(name.indexOf('Y'));            //0
        //System.out.println(name.indexOf("a",2));          //6
        //System.out.println(name.lastIndexOf("ar"));       //8
        //System.out.println(name.equals("Yash Pawar"));            // it gives true
        //System.out.println(name.equals("Yash"));                   // it gives false
        //System.out.println(name.equalsIgnoreCase("Yash Pawar"));  //true








    }
}
