/** write the program to calculate the sum of the first and the second last digit of a 5 digit
  Example :- number 12345 Output :- 1+4=5 */

package Operators;

public class Assignment_13 {
    public static void main(String[] args) {
        int num=12345;
        int sum=0;
        int digit=num%10;  //5
            num=num/10; //1234

            digit=num%10;   //4
            num=num/10; // 123
            sum = sum + digit;

            digit=num%10; //3
            num=num/10;  //12

             digit=num%10; //2
            num=num/10;  //1

             digit=num%10; //1
             sum=sum+digit;
        System.out.println(sum);





    }
}
