// define a method name 'perfect' that determines if parameter number is perfect number
//Use this function in a program that determines and prints all the perfect numbers between 1 and 1000
//

package Methods;

public class Assignment_13 {
    int number;

    void getInput(int a){
        number=a;
    }
    void perfect(){
        int sum=0;
        for (int i = 1; i <=number/2 ; i++) {
           if (number%i==0) {
               sum += i;
               System.out.println(i + " is factor of number " + number);
        }

    }
        System.out.println("sum of the factor number "+number+" is "+sum);
        System.out.println((sum==number)? "it is a perfect" : "it is not a perfect" );
        }

    public static void main(String[] args) {
        Assignment_13 assignment_13=new Assignment_13();
        assignment_13.getInput(6);
        assignment_13.perfect();
    }
    }

