package Interface.Functional_Interface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        // traditional way
        BiPredicate biPredicate1 = new BiPredicateImp();
        System.out.println(biPredicate1.test(1, 2));

        //-----------------------------------------------------------------

        // anonymous class way
        BiPredicate biPredicate = new BiPredicate() {
            @Override
            public boolean test(Object o, Object o2) {
                return false;
            }
        };
        System.out.println(biPredicate.test(3, 4));

        //------------------------------------------------------------------

        // lambda expression way
        BiPredicate lambda = ((o, o2) -> true);
        System.out.println(lambda.test(5, 6));
    }
}

class BiPredicateImp implements BiPredicate {

    @Override
    public boolean test(Object o, Object o2) {
        return true;
    }
}
