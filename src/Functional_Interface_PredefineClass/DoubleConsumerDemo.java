package Functional_Interface_PredefineClass;

import java.util.function.DoubleConsumer;

public class DoubleConsumerDemo {
    public static void main(String[] args) {
        // traditional way
        DoubleConsumer doubleConsumer=new DoubleConsumereImp();
        doubleConsumer.accept(1.10);

        //-----------------------------------------------------------------------

        // Anonymous class
        DoubleConsumer doubleConsumer1=new DoubleConsumer() {
            @Override
            public void accept(double value) {
                System.out.println("Hello1");
            }
        };
        doubleConsumer1.accept(2.20);

        //-----------------------------------------------------------------------

        //lambda expression
        DoubleConsumer lambda=(double value)->{
            System.out.println("Hello2");
        };
        lambda.accept(3.30);
    }
}
class DoubleConsumereImp implements DoubleConsumer{

    @Override
    public void accept(double value) {
        System.out.println("Hello");
    }
}
