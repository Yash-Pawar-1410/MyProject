package Interface.Functional_Interface;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        //traditonal way
        BinaryOperator binaryOperator = new BinaryOperatorImp();
        System.out.println(binaryOperator.apply(1, 2));

        //---------------------------------------------------------------

        // anonymous class way
        BinaryOperator binaryOperator1 = new BinaryOperator() {
            @Override
            public Object apply(Object o, Object o2) {
                return "Hello1";
            }
        };
        System.out.println(binaryOperator1.apply(3, 4));

        //---------------------------------------------------------------------

        // lambda expression way
        BinaryOperator lambda = (Object a, Object a2) -> {
            return "Hello2";
        };
        System.out.println(lambda.apply(5, 6));
    }
}

class BinaryOperatorImp implements BinaryOperator {
    @Override
    public Object apply(Object o, Object o2) {
        return "Hello";
    }
}
