/** The total number of student in a class are 90 out of which 45 are boys. if 50% of the total students secured grade 'a' out of which 20 are boys,
 // then write a program to calculate the total number of girls getting grade 'a' */

package Operators;

public class Assignment_12 {
    public static void main(String[] args) {
    int total=90;
    int boys=45;
    int girls=total-boys;
    int AGradeStud=(50*total)/100;
    int boyAGrade=20;
    int GirlAGrade=AGradeStud-boyAGrade;
        System.out.println("Total girls are "+girls);
        System.out.println("Total Secured 'A' grade students "+AGradeStud);
        System.out.println("Total Girls which is secured 'A' grade "+GirlAGrade);


        }

}
