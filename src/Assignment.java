import java.*;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {


        // Lets Program


// Assignment 1 (Write a program to get the following output " Hey there. I am data!")

        //System.out.println("Hey there. I am data!");

// Assignment 2 ( Write a program to print following on screen   *
//                                                               * *
//                                                               * * *)

        // without for loop
        /*
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        */

        // with loop
        /*
        int i,j,row=3;
        for (i=0; i<row; i++)
        {
            for (j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
         */

// Assignment 3 (print the following pattern on the screen          *****
        //                                                           ***
        //                                                            *
        //                                                           ***
        //                                                          *****)

        // Without loop
        /*
        System.out.println("*****");
        System.out.println(" ***");
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        */

        // With loop
        /*
        int i,j,k,row=3;
        for (i=0; i<=row-1; i++)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=row-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i=row-2; i>=0; i--)
        {
            for (j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for (k=i; k<=row-1; k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
         */


// Assignment 4 (Write a program to print the sum of the numbers 2,4 and 5)
      /*
        int a=2;
        int b=4;
        int c=5;
        int sum;
        sum=a+b+c;
        System.out.println(sum);
       */

//Assignment 5 (Write the program to print the difference and product  of the  numbers 45 and 32)
        /*
        int a=45;
        int b=32;
        int difference;
        int product;
        difference=a-b;
        product=a*b;
        System.out.println(difference);
        System.out.println(product);
         */

// Known data type

// Assignment 1 (Write a java program  to print an int, a double and a char on screen)
        //int

        // int a=5;
        // System.out.println(a);


        // double dub=546649.246456d;
        //System.out.println(dub);

        // char gender ='m';
        // System.out.println(gender);

// Assignment 2 (Write a program to print the area of a rectangle of sides  2 and 3 units respectively)
       /*
        int l=2;
        int b=3;
        int area;
        area=l*b;
        System.out.println(area);
        */

// Assignment 3 (Write the program to print the product of the numbers 8.2 And 6)
       /*
        float a=8.2f;
        float b=6;
        float product;
        product= a*b;
        System.out.println(product);
        */


// Assignment 4 (Print the ASCII value of the character 'h')
       /*
        int ch='h';
        System.out.println(ch);
        char ch='h';
        System.out.println((int)ch);
       definition :-
        => In datatype casting it is called widening (Conversion of lowest datatype into highest datatype)
        => and in class casting  it is called upcasting (In oops concept = inheritance)
        int ch=104;
        System.out.println((char)ch);
        Definition :-
        => In datatype casting it is called Narrowing  (Conversion of highest datatype into lowest datatype)
        => and in class casting  it is called down-casting (In oops concept = inheritance)
        */

// Assignment 5 (Write a program to assign a vale of 100.235 to a double variable and then convert it into int)
        /*
        double ch=100.235d;
        System.out.println((int)ch);
         */


// Assignment 6 (Write a program to add 3 to the ASCII value of the cha 'd' and print the equivalent char)

      /*
        int ch='d'+3;
        System.out.println(ch);
        System.out.println((char)ch);

       */


// Assignment 7 (Write a program to add an integer variable having value 5 and a double variable having value 6.2)
        /*
        int a=5;
        double b=6.2d;
        double add;
        add =a+b;
        System.out.println(add);
         */

// Assignment 8 (Write a program to find the square of the number 3.9)
        /*
        float a=3.9f;
        float square;
        square=a*a;
        System.out.println(square);
         */


// Operators

// Assignment 1 (length and breadth of a rectangle are 5 and 7 respectively)
       /*
        int length=5;
        int breadth=7;
        int  area;
        area=length*breadth;
        System.out.println(area);
        */


// Assignment 1.1 (Write a program to calculate  the area and perimeter of the rectangle)
        /*
        double length=5;
        double breadth=6;
        double area=length*breadth;
        double perimeter=2*(length+breadth);
        System.out.println(area);
        System.out.println(perimeter);
         */

// Assignment 2 (Write a program to calculate the perimeter of a triangle having sides of length having sides of a length 2,3 and 5 units)
       /*
        int a=2;
        int b=3;
        int c=5;
        int perimeter=a+b+c;
        System.out.println(perimeter);
        */

// Assignment 3 (Write a program to add 8 to the number 2345 and then divide by 3)
      /*
        int a=8;
        float b=2345;
        float add=a+b;
        float divide=add/3;
        System.out.println(add);
        System.out.println(divide);

       */


// Assignment 3.1 (Now the modulus of the quotient is taken with 5 and then multiply the resultant value by 5 )

        //System.out.println( (float) (((8+2345)/3)%5)*5);

// Assignment 4 (Solve the above question  using assignment operator (eg. +=,-=,*=))
// Assignment 5 (write a program to check if the two number 23 and 45 are equal )

        //System.out.println(23 == 45);

// Assignment 6 (Write a program to print power of  7 raised to 5)

        //System.out.println((float) 7*7*7*7*7);

// Assignment 7 (Assign values of variable 'a' and 'b' as 55 and 70 respectively and then check if both the condition 'a<50' and 'a<b' are true)
        /*
        int a=50;
        int b=77;
        System.out.println( a<50 && a<b);

         */

// Assignment 8 (Now solve the above question (Assignment 7) to check if at least one of the condition 'a<50' or 'a<b' is true)

        /*
        int a=50;
        int b=77;
        System.out.println(a<50 || a<b);
         */

// assignment 9 (If the marks of robert in three subjects are 78,45 and 62 respectively (each out of 100). write a program to calculate his total marks and percentage marks)
/*
        int sub1=78;
        int sub2=45;
        int sub3=62;
        float totalMark=sub1+sub2+sub3;
        float percentage=totalMark/300*100f;
        System.out.println(totalMark);
        System.out.println(percentage);
 */

// Assignment 10 (Suppose the value if variable 'a' and 'b' are 6 and 8 respectively, Write two programs to swap the values of the two variables)

        // 1 ) first program by using a third variable

       /*
        int a=6;
        int b=8;
        int c=0;
        c=a;
        a=b;
        b=c;

        System.out.println("the value of a is");
        System.out.println(a);
        System.out.println("the value of b is");
        System.out.println(b);

        */


// 2)  second program without using any variable
/*
        int a=6;
        int b=8;
        b=b-a;
        a=b+a;
        b=-(b-a);
        System.out.println("the value of a is ");
        System.out.println(a);
        System.out.println("the value of b is ");
        System.out.println(b);

 */


// Assignment 11 (Write the program to convert fahrenheit into celsius)
/*
        float f=50;
        float celsius;
        celsius=(float) (f-32)*5/9;
        System.out.println(celsius);
         */


// Assignment 12 (The total number of student in a class are 90 out of which 45 are boys. if 50% of the total students secured grade 'a' out of which 20 are boys,
// then write a program to calculate the total number of girls getting grade 'a' )

       /*
        int total = 90;
        int boys =45;
        int AGradeBoys=20;
        int Girls=90-boys;
        int AGradeStud = (50*total)/100;
        System.out.println("Total girls are");
        System.out.println(Girls);
        System.out.println("Total number of students who secured 'A' Grade");
        System.out.println(AGradeStud);
        System.out.println("Total number of girls who secured 'A' Grade");
        System.out.println(AGradeStud-AGradeBoys);
  */

//Assignment 13 (write the program to calculate the sum of the first and the second last digit of a 5 digit
// Example :- number 12345 Output :- 1+4=5)
 /*
        int number= 12345;
        int sum=0;
        int digit=number%10; //5
        number=number/10;    //1234

        digit=number%10;  //4
        sum=sum+digit;

        digit=number%10;  //4
        number=number/10;  //123

        digit=number%10;   //3
        number=number/10;   //12

        digit=number%10;  //2
        number=number/10; //1

        digit=number%10;  //1
        number=number/10;  //0

        sum=sum+digit;
        System.out.println("sum of the first and the second last digit is  " +sum);
*/


// Assignment 14 (Take a 4-digit number. write a program to display a number whose digits are grater than the corresponding digits of the number taken
// Example if the number which was taken is 5696 then the displayed number should be 7818)


// Assignment 15 (Write the program to calculate the sum of the digit of a 3-digit number
// Example number :- 123 Output :- 6)
/*
        int num =123;
        int sum;

        int digit1=num%10;
        num=num/10;

        int digit2=num%10;
        num=num/10;

        int digit3=num%10;

        sum=digit1+digit2+digit3;
        System.out.println(sum);

 */

// Assignment 16 (Write a program to reverse  a 3-digit number
// Example number 123 Output :- 321)
/*
        int num=123;

        int digit=num%10;
        num=num/10;

        int digit1=num%10;
        num=num/10;

        int digit2=num%10;
        num=num/10;

        System.out.print(digit);
        System.out.print(digit1);
        System.out.print(digit2);

 */



   /*
    int num=123, rev=0;

    while (num!=0)
    {
        int rem = num % 10;
        rev= rev * 10 + rem;
        num= num / 10;
    }
        System.out.println("The reverse order of the number is" +rev);

    */


//UserInput

// Assignment 1 (Write a program to take two integer inputs from user and print sum and product of them)
          /*
            Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a;
        a= sc.nextInt();
        System.out.println("Enter the second number ");
        int b;
        b= sc.nextInt();
        int sum=a+b;
        int product=a*b;
        System.out.println("sum of the two number is  ");
        System.out.println(sum);
        System.out.println("product of the two number is  ");
        System.out.println(product);

           */

// Assignment 2 (Take two integer inputs from user
// first calculate the sum of two then product of two
// finally print the sum and product of both obtained results)
      /*
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number ");
        int a;
        a=sc.nextInt();
        System.out.println("enter the second number ");
        int b;
        b= sc.nextInt();
        int sum=a+b;
        int product=a*b;
        int add=sum+product;
        System.out.println("sum of two number is  " +sum);
        System.out.println("product of number is  " +product);
        System.out.println("addition of sum and product is "+add);
       */

// Assignment 3 (Ask user to give two double input for length and breadth of a rectangle and print area type casting to int)
   /*
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length");
        double length;
        length= sc.nextDouble();
        System.out.println("Enter the breadth");
        double breadth;
        breadth= sc.nextDouble();
        int area= (int) ((int) length*breadth);
        System.out.println("Area of the rectangle is : " +area  );

    */

// Assignment 4 (Take name, roll number and field of interest from user and print in the format below
// hey, my name is xyz and my roll number is xyz. My field of interest are xyz)
      /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String Name;
        Name= sc.nextLine();
        System.out.println("Enter your area of interest");
        String Area;
        Area= sc.nextLine();
        System.out.println("Enter the roll number");
        int RollNumber;
        RollNumber= sc.nextInt();

        System.out.println("Hey,");
        System.out.println("My name is "+Name+" and my roll number is "+RollNumber+". My field of interest are " +Area);

       */


// Assignment 5 (Take side of a square from user and print area and perimeter of it)
       /*
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side of square ");
        double square;
        square= sc.nextDouble();
        double area = square * square;
        System.out.println("Area of square is "+area);
        double perimeter=4*square;
        System.out.println("Perimeter of square is "+perimeter);
        */

// Assignment 6 ( Write a program to find square of a number
// example input 2 output 4)
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        double num;
        num= sc.nextDouble();
        double square=num*num;
        System.out.println("Square of number is " +square);
         */


// Assignment 7 (Take two different string input and print them in same line
// example input Codes
// Dope
// output CodeDope)
 /*
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string ");
        String Str1;
        Str1= sc.nextLine();
        System.out.println("Enter the second string");
        String Str2;
        Str2=sc.nextLine();
        String add= Str1+Str2;
        System.out.println("Entire string is :\n"+add);
*/


// Assignment 8 (Take 3 input from user and check all are equal
// (use && ||))

        /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1;
        num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2;
        num2= sc.nextInt();
        System.out.println("Enter the third number");
        int num3;
        num3 = sc.nextInt();
        if(((num1==num2)&&(num1==num3)) && num2==num3){
            System.out.println("all no are same");
            }
        else {
            System.out.println("no are not same");
        }
        */


// Assignment 9 (Write a program to enter the value of two variable 'a' and 'b' from keyboard and then check if both the conditions
// 'a < 50' and  ' a<b' are true)
      /*
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b= sc.nextInt();
        if (a<50 && a<b){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

       */


// Assignment 10 (If the marks of robert in three subjects are entered through keyboard (each out of 100), Write a program to calculate
// his total marks and percentage marks)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the three subjects");
        int Mark1 = sc.nextInt();
        int Mark2 = sc.nextInt();
        int Mark3 = sc.nextInt();
        float sum = Mark1 + Mark2 + Mark3;
        System.out.println("total sum of the three subject is :" + sum);
        float per = (sum / 300) * 100;
        System.out.println("Percentage of the subjects is :" + per);


// IF else

// Assignment 1 (take values of length and breadth of a rectangle from user and check if it is square or  not)

      /*

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length ");
        length=sc.nextInt();
        System.out.println("Enter the breadth ");
        breadth= sc.nextInt();
        if (length==breadth)
        {
            System.out.println("it is a square");
        }
        else {
            System.out.println("it is not square");
        }
*/


// Assignment 2 (Take two int value from user and print greatest among them)

        /*
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        a= sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        if (a>b){
            System.out.println("Greatest number is " +a);

        } else if (a<b) {
            System.out.println("Greatest number is"+b);

        } else {
            System.out.println("both are equal number");
        }

         */


// Assignment 3 (A shop will give discount of 10% if the cost of purchased quality is more than 1000 ask user for quantity suppose one unit will cost
// 100 judge and print total cost for user)

/*
        int Quantity;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the quantity");
        Quantity= sc.nextInt();
        if (Quantity*100>10000)
        {

            System.out.println((Quantity*100)-((Quantity/100)*100));
            System.out.println("cost is");
        }
        else {
            System.out.println("cost is"+ Quantity*100);
        }

 */

// Assignment 4 (A company decided  to give bonus of 5% to employee if his/her year of service more than 5 years
// ask user for their salary and year of service and print the net bonus)

     /*
        int salary;
        int service;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the service in year");
        service =sc.nextInt();
        System.out.println("Enter the salary");
        salary = sc.nextInt();
        if (service>5)
        {
            System.out.println("Your service is above 5 year so you get 5% bonus, So now your total salary is");
            System.out.println((salary)+((5*salary)/100))
        }
        else {
            System.out.println("Sorry you are not eligible fo bonus because your service less than 5, So your salary is ");
            System.out.println(salary);
        }

      */

// Assignment 5 (A school has the  following rules for grading system
// a. below 25-F
// b. 25 to 45-E
// c. 45 to 50-D
// d. 50 to 60-C
// e. 60 to 80-B
// f. above 80-A
// ask user to enter marks and print the corresponding grade)

       /*
        int marks;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks");
        marks= sc.nextInt();

        if (marks<25){
            System.out.println("F");
        } else if (marks<=45) {
            System.out.println("E");
        }
        else if (marks<=50) {
            System.out.println("D");
        }
        else if (marks<=60) {
            System.out.println("C");
        }
        else if (marks<=80) {
            System.out.println("B");
        }
        else if (marks<=100) {
            System.out.println("A");
        }
        else {
            System.out.println("visit your teacher");
        }

        */

// Assignment 6 (Take input of age of 3 people by user and determine oldest and youngest among them)
        /*
        int age1;
        int age2;
        int age3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the three ages");
        age1= sc.nextInt();
        age2= sc.nextInt();
        age3= sc.nextInt();
        if (age1<age2 && age1 < age3)
        {
            System.out.println("the youngest is"+age1);
        } else if (  age2<age3) {
            System.out.println("the youngest is"+age2);
        }
        else {
            System.out.println("the youngest is"+age3);
        }
         if (age1>age2 && age1>age3){
             System.out.println("Oldest is");
         }
         else if ( age2>age3) {
             System.out.println("the Oldest is"+age2);
         }
         else {
             System.out.println("the Oldest is"+age3);
         }

         */


// Assignment 7 (Write a program to print absolute values of a number entered by user
// input 1   output  1
// input -1  output 1)
        /*
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        if (num<0){
            System.out.println(num*-1);
        }
        else {
            System.out.println(num);
        }
        */

// Assignment 8 (A student will not be allowed to sit in exam if his/her attendance is less than 75%, take the user input from user number of classes held , number of classes
// attended and print percentage of class attended is student is allowed to sit in exam or not)
       /*
        int classes;
        int attend;
        float attended;
        Scanner sc =new Scanner(System.in);
        System.out.println("Number of the classes held");
        classes= sc.nextInt();
        System.out.println("Number of attendance");
        attend= sc.nextInt();
        attended = ((attend)/(float)(classes)*100);
        if (attended>=75){
            System.out.println("You allow to sit in exam");
        }
        else {
            System.out.println("you are not allow to sit in exam");
        }

        */

// Assignment 9 (Modify the above question to allow student to sit  if he/she has medical cause. Ask user if he/she has medical cause  or not ('Y' or 'N' ) and print accordingly
/*
        int classes;
        int attend;
        float attended;
        char medical;

        Scanner sc =new Scanner(System.in);

        System.out.println("Number of the classes held");
        classes= sc.nextInt();
        System.out.println("Number of the attendance");
        attend= sc.nextInt();
        attended = ((attend)/(float)(classes)*100);
        System.out.println("If medical cause type y otherwise type n");
        medical= sc.next().charAt(0);

        if (attended>=75) {
            System.out.println("You allow to sit in exam");
        } else if (medical=='y') {
            System.out.println("you are allow to sit in exam");
        } else {
            System.out.println("you are not allow to sit in exam");
        }
        */


        // Assignment 10
        /*
        int x=2;
        int y=5;
        int z=0;
        if (x==2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (x!=5){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (x!=5 && y>=5){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (z!=0 || x==2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (!(y<10)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

         */

//Assignment 11 (Write a program to check if a year is leaf year or not
// If a year is divisible by 4 then it is leaf year like 2000,1900,2100 then it must be divisible by 400)
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year  ");
        int year;
        year= sc.nextInt();
        if (year% 400==0 || (year%100 !=0 && year%4==0)){
            System.out.println("this is a leaf year  ");
        }
        else {
            System.out.println("this is not a leaf year  ");
        }

         */


// Assignment 12 (Ask user to enter age, sex, marital status and then using the following  rules print their place of the service
// if employee is female then she will work only in urban areas
// if employee is a male and age is in between 20 and 40 then he may work in anywhere
// if employee is a male and age is in between 40 and 60 then he will work in urban areas only
// and any other input of age should print "ERROR")


        /*
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age ");
        int age ;
        age = sc.nextInt();
        System.out.println("Enter your sex 'M' or 'F' ");
        char sex;
        sex = sc.next().charAt(0);
        System.out.println("Enter your marital status 'Y' or 'N' ");
        char marital_status;
        marital_status = sc.next().charAt(0);
        if (sex=='F'){
            System.out.println("Employee sex is female you will work only in urban area");
        } else if (sex=='M' && (age>20 && age<40)) {
            System.out.println("Employee sex is male you will work in anywhere");
        } else if (sex=='M' && (age>40 && age<60)) {
            System.out.println("Employee sex is male you will work in in urban area only");
        }
        else {
            System.out.println("Error");
        }

         */


// Assignment 13 (A 4-digit number is entered through keyboard. Write a program to print a new number with digits reversed as of original one)


        /*
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter four digit number");
        int num;
        num= sc.nextInt();

        int digit=num%10;
        num=num/10;

        int digit1=num%10;
        num=num/10;

        int digit2=num%10;
        num=num/10;

        int digit3=num%10;
        num=num/10;

        System.out.print(digit);
        System.out.print(digit1);
        System.out.print(digit2);
        System.out.print(digit3);

         */


    }

}