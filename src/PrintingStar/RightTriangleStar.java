package PrintingStar;

public class RightTriangleStar {
    public static void main(String[] args) {
        for (int row = 0; row <4 ; row++) {
            for (int column = 0; column < row ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
