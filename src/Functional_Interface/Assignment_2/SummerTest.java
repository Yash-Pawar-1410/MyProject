package Functional_Interface.Assignment_2;

public class SummerTest {
    public static void main(String[] args) {
        Summer<Integer> summer=(num1,num2)->num1+num2;
        System.out.println("Addition of integer "+summer.add(10,20));

        Summer<Double> summer1=(num1, num2) -> num1+num2;
        System.out.println("Addition of double "+summer1.add(10.1,10.2));

        Summer<Long> summer2=(num1, num2) -> num1+num2;
        System.out.println("Addition of long "+summer2.add(1022L, 1055L));
    }
}
