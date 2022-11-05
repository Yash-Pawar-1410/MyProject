package Interface.Functional_Interface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Traditional way
        Supplier supplier1 = new SupplierImp();
        System.out.println(supplier1.get());

        //------------------------------------------------------------------

        // anonymous class way
        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return "Hello1";
            }
        };
        System.out.println(supplier.get());

        //------------------------------------------------------------------

        // lambda expression way
        Supplier lambda = () -> "Hello2";
        System.out.println(lambda.get());
    }
}

class SupplierImp implements Supplier {
    @Override
    public Object get() {
        return "Hello";
    }
}
