package Functional_Interface_PredefineClass;

public class ComparableDemo {
    public static void main(String[] args) {
        // traditional way
        Comparable comparable1 = new ComparabaleImp();
        System.out.println(comparable1.compareTo(1));

        //------------------------------------------------------------------

        //Anonymous class way
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 20;
            }
        };
        System.out.println(comparable.compareTo(2));

        //------------------------------------------------------------------

        // lambda expression way
        Comparable lambda = (object) -> 30;
        System.out.println(lambda.compareTo(3));
    }
}

class ComparabaleImp implements Comparable {

    @Override
    public int compareTo(Object o) {
        return 10;
    }
}