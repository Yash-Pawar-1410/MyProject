package Functional_Interface.Assignment_5;

public class AreaImpl implements Area <Double>{
    @Override
    public Double AreaOfCircle(Double num1) {
        return (3.14*num1*num1);
    }

    public static void main(String[] args) {
        Area <Double> area=(num1)->3.14*num1*num1;
        System.out.println("Area of the circle is "+area.AreaOfCircle(10.5d));
    }
}
