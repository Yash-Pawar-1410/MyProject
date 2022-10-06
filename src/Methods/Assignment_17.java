// create a class to print an integer and a character with two method having the same name but different sequence of the integer and the character
// parameter
// for example , if the parameter of the first method are of the form (int n, char c) then that of the second method will be of the form (char c,int n)
package Methods;

public class Assignment_17 {
    void name(int n,char c){
        System.out.println(n);
        System.out.println(c);
    }
    void name(char c,int n){
        System.out.println(c);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Assignment_17 assignment_17=new Assignment_17();
        assignment_17.name(10,'a');
        assignment_17.name('a',10);
    }
}
