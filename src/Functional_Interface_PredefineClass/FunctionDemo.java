package Functional_Interface_PredefineClass;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //traditional way
        Function function1 = new FuctionImp();
        System.out.println(function1.apply(1));

        //------------------------------------------------------------------

        //Anonymous way
        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return "Hello1";
            }
        };
        System.out.println(function.apply(2));

        //------------------------------------------------------------------

        // lambda expression way
        Function lambda = (apply) -> "Hello3";
        System.out.println(lambda.apply(3));
    }
}

class FuctionImp implements Function {

    @Override
    public Object apply(Object o) {
        return "Hello";
    }
}