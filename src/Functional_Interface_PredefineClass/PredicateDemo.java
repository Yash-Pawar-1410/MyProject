package Functional_Interface_PredefineClass;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //  Traditional way
        Predicate predicate1 = new PredicateImp();
        System.out.println(predicate1.test(1));

        //------------------------------------------------------------------

        // anonymous class way
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return true;
            }
        };
        System.out.println(predicate.test(12));

        //------------------------------------------------------------------

        // Lambda expression
        Predicate lambda = (object) -> false;
        System.out.println(lambda.test("hello"));
    }
}

class PredicateImp implements Predicate {

    @Override
    public boolean test(Object o) {
        return false;
    }
}