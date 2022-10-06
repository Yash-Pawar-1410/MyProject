// define a method to print the prime factors of a number
package Methods;

public class Assignment_11 {
    int num;
    void input(int a){
        num = a;
    }
    void factor(){
        for (int i = 1; i <=num/2 ; i++) {
            if (num%i==0){
                System.out.println(i + " factor of "+num);
            }
        }
    }

    public static void main(String[] args) {
        Assignment_11 assignment_11=new Assignment_11();
        assignment_11.input(10);
        assignment_11.factor();
    }
}
