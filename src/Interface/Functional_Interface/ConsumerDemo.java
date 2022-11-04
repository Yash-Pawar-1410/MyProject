package Interface.Functional_Interface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // traditional way
        Consumer consumer1=new ConsumerImmp();
        consumer1.accept(2);
        // Anonymous class way
        Consumer consumer=new Consumer() {
            @Override
            public void accept(Object o) {
                int i = 10 + 10;
                System.out.println(i);
            }
        };
        consumer.accept(1);
        // lambda expression way
        Consumer lambda=(x)->{
            System.out.println(30);
        };
        lambda.accept(10);
    }
}
class ConsumerImmp implements Consumer{

    @Override
    public void accept(Object o) {
        int a=5+5;
        System.out.println(a);
    }
}
