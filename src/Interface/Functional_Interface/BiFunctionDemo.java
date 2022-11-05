package Interface.Functional_Interface;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        // traditional way
        BiFunction biFunction=new BiFunctionImp();
        System.out.println(biFunction.apply(1,2));

        //-------------------------------------------------------------------

        // anonymous class way
        BiFunction biFunction1=new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return "Hello1";
            }
        };
        System.out.println(biFunction1.apply(3,4));

        //-------------------------------------------------------------------

        // lambda expression way
        BiFunction lambda=(Object a, Object a2)->{
            return "Hello3";
        };
        System.out.println(lambda.apply(5,6));
    }
}
class BiFunctionImp implements BiFunction{

    @Override
    public Object apply(Object o, Object o2) {
        return "Hello";
    }
}
