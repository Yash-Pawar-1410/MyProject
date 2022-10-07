
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {


        // Simple Print
        // System.out.println("hello, how are you");

        // Print using user input
      /*  String name;
        Scanner sc= new Scanner(System.in);
        name=sc.nextLine();
        System.out.println(name);
*/



        // Simple addition
      /*  int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);*/




        // Addition using user input
     /*   int a,b;
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
  /*      int b=25;
        int a=10;
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
  /*      int a, b, c, d;
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
      /*  int principalAmount=10000;
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


        // String name="Yash Pawar";
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


// "+" operator perform addition and string concatenation
/*
        System.out.println(50+10);
        System.out.println(5.25+25);
        System.out.println(15.10+40.10);
        System.out.println(5+'a');
        System.out.println('A'+'a');
        System.out.println(10+"string");
        System.out.println(10+20+30+"string");
        System.out.println("string"+20+30+30);
        System.out.println("string"+20);
        System.out.println('a'+"string");
        System.out.println("string"+'A');
        System.out.println("string"+"String");
*/



// Data type
        // datatype are used to represent type of information

// Byte data type
/*
        byte a = (byte) 128;  // data loss take place in these
        System.out.println("if we enter value above the max (by using casting it starts checking number from min value) ");
        System.out.println(a);
        System.out.println("minimum value of byte is ");  // -128
        System.out.println(Byte.MIN_VALUE);
        System.out.println("maximum value of byte is ");  //127
        System.out.println(Byte.MAX_VALUE);

*/


// Short data type
/*
        short a=(short)32768; // data loss take place in this
        System.out.println("if we enter value above the max (by using casting it starts checking number from min value) ");
        System.out.println(a);
        System.out.println("minimum value is ");  // -32768
        System.out.println(Short.MIN_VALUE);
        System.out.println("maximum value is ");  // 32767
        System.out.println(Short.MAX_VALUE);

*/


   // Int data type
/*
        int a= 2147483647;  // after increase 1 digit it gives error integer number too long
        System.out.println("after increase 1 digit it gives error integer number too long cz the maximum value of int is ");
        System.out.println(a);
        System.out.println("minimum value is" );  // -2147483648
        System.out.println(Integer.MIN_VALUE);
        System.out.println("maximum value is");  // 2147483647
        System.out.println(Integer.MAX_VALUE);

*/



// Long data type
/*
        long a= 9223372036854775807L;   // after increase 1 digit it gives error integer number too long
        System.out.println("after increase 1 digit it gives error integer number too long cz the maximum value of long is ");
        System.out.println(a);
        System.out.println("minimum value is" );  // -9223372036854775808
        System.out.println(Long.MIN_VALUE);
        System.out.println("maximum value is");  // 9223372036854775807
        System.out.println(Long.MAX_VALUE);


*/


//Float data type
/*
        float a=3.4028235E38f;    // after increase 1 digit it gives error floating number too long
        System.out.println("after increase 1 digit it gives error floating number too long cz  the maximum value of float is ");
        System.out.println(a);
        System.out.println("minimum value is ");    //1.4E-45
        System.out.println(Float.MIN_VALUE);
        System.out.println("maximum value is ");    //3.4028235E38
        System.out.println(Float.MAX_VALUE);

*/



// double data type
/*

        double a= 1.7976931348623157E30; // after increase 1 digit it gives error floating number too long
        System.out.println("after increase 1 digit it gives error floating number too long cz  the maximum value of double is ");
        System.out.println(a);
        System.out.println("minimum value is");    // 4.9E-324
        System.out.println(Double.MIN_VALUE);
        System.out.println("maximum value is");    // 1.7976931348623157E308
        System.out.println(Double.MAX_VALUE);
*/




    // Char data type

       // char a='a';
        //System.out.println(a);


// boolean data type
        short s=20;
/*
        boolean a = true;
        System.out.println(a);
        boolean b = false;
        System.out.println(b);



        byte b =10;
        int i=30;
        long l=40L;
        float f=50.5f;
        double d=60.6d;
         char c='A';
       System.out.println(d+c);
*/



// Variables
// variable is a small piece of information which can be used to store program data
// variable plays an important role while shifting the data form front end to database
// there are three types to store data in variables


// Declaration = it is the process of creating new variable

        //String empName;
        //double empSalary;
        //char empChar;

//  Initialization = at the time of variable creation if we assign the value to the variable
          // int empId=150;
         //String empName = "Yash";
        //System.out.println(empId);

// Assignment = at the time of variable creation if we assign the value  after the variable
/*
        int a;
        a=10;
        int b;
        b=10;
        int sum;
        sum=a+b;
        System.out.println(sum);


*/


// Re-initialization = if we assign the different value to existing variable
        // it's not mandatory to re-initialization to each and very variable

        //double a=25.25;
        //System.out.println("a value is" +a);
        //a=32.32;
        //System.out.println("re-initialization value is"+a);


   // updated salary
/*
        int salary=35000;
        System.out.println("the salary of the employ is "+salary);
        int updatedSalary=salary+(20*salary)/100; // another way is salary * 0.20
        System.out.println("new salary is "+updatedSalary);
*/



// discount
/*
        int quantity = 25;
        double price = 432.21;
        double totalAmount = quantity * price;
        double discountAmount = totalAmount - totalAmount * 0.10;
        double finalAmount = totalAmount-(discountAmount + discountAmount * 00.05);
        System.out.println("quantity is \t" + quantity);
        System.out.println("price is \t" + price);
        System.out.println("total amount is \t" + totalAmount);
        System.out.println("discount amount is \t" + discountAmount);
        System.out.println("final amount using double discount is \t" + finalAmount);

*/


        // discount by using user input
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of the product :");
        int quantity = sc.nextInt();
        System.out.println("Price of the product is :");
        float price = sc.nextFloat();
        float totalAmount = quantity * price;
        System.out.println("Total amount is :" + totalAmount);
        float discountAmount = totalAmount * 0.10f;
        System.out.println("Discount price is :" + discountAmount);
        float doubleDiscount = discountAmount * .10f;
        System.out.println("Double discount price is :" + doubleDiscount);
        float finalPrice = totalAmount-(discountAmount + doubleDiscount);
        System.out.println("Final price of product is :" + finalPrice);
*/





// float and double output of same input
/*
        double num1=25.235d;
        double num2=12.12523d;
        System.out.println("Result of double is");
        System.out.println(num1*num2);

        float no1=25.235f;
        float no2=12.12523f;
        System.out.println("Result of float is");
        System.out.println(no1*no2);


*/


// input to variable is different but output of all variable is same
/*
        int no1 = 15, no2 = 45, no3 = 65;
        System.out.println(no1 + "\t" + no2 + "\t" + no3 + "\t");
        no3 = no1;
        no2 = no3;
        no1 = no2;
        System.out.println(no1 + "\t" + no2 + "\t" + no3 + "\t");

*/



// char print in int
/*
        char c1 = 'a', c2 = 'b', c3 = 'c';
        System.out.println(c1 + "\t" + c2 + "\t" + c3);
        System.out.println((int) c1 + "\t" + (int) c2 + "\t" + (int) c3);
        System.out.println((int) (c1 - 32) + "\t" + (int) (c2 - 32) + "\t" + (int) (c3 - 32));
        System.out.println((char) (c1 - 32) + "\t" + (char) (c2 - 32) + "\t" + (char) (c3 - 32));
*/



// increment and decrement
      //  int a=1;
       // System.out.println(++a + a++ + ++a);
        
// table of 15
       // int num=15;
        //int mul=0;
        //for (int i=1; i<=10; i++){
          //  System.out.println(num*i);
        //}


// Checking password same or not using if else
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name or username ");
        String name = sc.nextLine();
        System.out.println("Please enter your password ");
        String pass = sc.nextLine();
        System.out.println("Please confirm your password");
        String confPass = sc.nextLine();
        System.out.println("Your username is :" + name);
        if (pass.equals(confPass)) {
            System.out.println("Your password is :" + pass);
        } else {
            System.out.println("Please check your password");
        }

*/

















    }
}
