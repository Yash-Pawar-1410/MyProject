package LambdaExpression;
interface Subtraction{
    int Subtract(int n1,int n2);
}

class SubtractionImp implements Subtraction{

    @Override
    public int Subtract(int n1, int n2) {
        return n1-n2;
    }
}
public class Sub {
    public static void main(String[] args) {
        Subtraction subtraction1=new SubtractionImp();
        System.out.println(subtraction1.Subtract(10,5));
        //---------------------------------------------------------
        Subtraction subtraction2=new Subtraction() {
            @Override
            public int Subtract(int n1, int n2) {
                return n1-n2;
            }
        };
        System.out.println(subtraction2.Subtract(20,10));
        //-----------------------------------------------------------
        Subtraction lambda =(n1, n2)->n1-n2;
        System.out.println(lambda.Subtract(20,5));

    }
}
