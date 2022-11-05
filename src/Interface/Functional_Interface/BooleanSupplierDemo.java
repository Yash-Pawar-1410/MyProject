package Interface.Functional_Interface;

import java.util.function.BooleanSupplier;

public class BooleanSupplierDemo {
    public static void main(String[] args) {
        // traditional way
        BooleanSupplier booleanSupplier = new BooleanSupplierImp();
        System.out.println(booleanSupplier.getAsBoolean());

        //------------------------------------------------------------------

        // anonymous class way
        BooleanSupplier booleanSupplier1 = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return false;
            }
        };
        System.out.println(booleanSupplier1.getAsBoolean());

        //------------------------------------------------------------------

        // lambda expression
        BooleanSupplier lambda = () -> {
            return true;
        };
        System.out.println(lambda.getAsBoolean());
    }
}

class BooleanSupplierImp implements BooleanSupplier {

    @Override
    public boolean getAsBoolean() {
        return true;
    }
}
