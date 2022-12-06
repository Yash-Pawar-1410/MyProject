package Functional_Interface_PredefineClass;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorDemo {
    public static void main(String[] args) {
        // traditional way
        DoubleBinaryOperator doubleBinaryOperator=new DoublebinaryOperatorImp();
        System.out.println(doubleBinaryOperator.applyAsDouble(1,2));

        //-----------------------------------------------------------------------------------

        // anonymous class way
        DoubleBinaryOperator doubleBinaryOperator1=new DoubleBinaryOperator() {
            @Override
            public double applyAsDouble(double left, double right) {
                return 20.20;
            }
        };
        System.out.println(doubleBinaryOperator1.applyAsDouble(3,4));

        //-----------------------------------------------------------------------------------

        // lambda expression way
        DoubleBinaryOperator lambda=(double left, double right)->{
            return 30.30;
        };
        System.out.println(lambda.applyAsDouble(5,6));

    }
}
class DoublebinaryOperatorImp implements DoubleBinaryOperator{
    @Override
    public double applyAsDouble(double left, double right) {
        return 10.10;
    }
}
