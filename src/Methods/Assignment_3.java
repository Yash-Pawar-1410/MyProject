// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote
package Methods;

public class Assignment_3 {

    int age;
    void input(int a){
        age=a;
    }
     void logic(){
        if (age>=18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("your age is under 18 you can't vote");
        }
     }

    public static void main(String[] args) {
        Assignment_3 assignment_3=new Assignment_3();
        assignment_3.input(17);
        assignment_3.logic();
    }

}
