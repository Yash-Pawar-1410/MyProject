package LambdaExpression;
@FunctionalInterface
public interface Area {
    int areaOfTriangle(int l, int b);
    default int areaOfSquare(int a,int b){
        return 4*a*b; // it is fake formulae
    }
}
class AreaTest implements Area{

    @Override
    public int areaOfTriangle(int l, int b) {
        return l*b;
    }

    public static void main(String[] args) {
        Area lambda=(l,b)->l*b;
        System.out.println("Area of the triangle "+lambda.areaOfTriangle(5,6));
        System.out.println("Area of the square "+lambda.areaOfSquare(5,6));
    }
}
