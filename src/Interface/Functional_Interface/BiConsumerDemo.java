package Interface.Functional_Interface;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        // traditional way
        BiConsumer biConsumer1 = new BiConsumerImp();
        biConsumer1.accept(1, 2);

        //-----------------------------------------------------------

        // anonymous class way
        BiConsumer biConsumer = new BiConsumer() {
            @Override
            public void accept(Object o, Object o2) {
                int i = 10 + 10;
                System.out.println(i);
            }
        };
        biConsumer.accept(3, 4);

        //------------------------------------------------------------

        //lambda expression way
        BiConsumer lambda = ((o, o2) -> {
            int i = 30;
            System.out.println(i);
        });
        lambda.accept(5, 6);
    }
}

class BiConsumerImp implements BiConsumer {

    @Override
    public void accept(Object o, Object o2) {
        int a = 5 + 5;
        System.out.println(a);
    }
}