package OOPs.Polymorphism;

public class Overriding extends Overloading {

    // overloading
    int hello(int a, int b, int c) {
        return a + b + c;
    }

    // overriding
    @Override
    int hello(int a, int b) {
        return a + b;
    }

    protected int hello1(int a, int b) {
        return a + b;
    }

    public int hello2(int a, int b) {
        return a + b;
    }
//    private int hello2(int a,int b){      we get compile time error if we take private modifier
//        return a+b;
//    }
//---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
    public int hello3(int a, int b) {
        return a + b;
    }

    protected int hello4(int a, int b) {
        return a + b;
    }
//     int hello5(int a, int b) {    we cannot take default modifier if we give protected modifier in parent class
//        return a + b;                otherwise we get compile time error
//    }
// ---------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------
// int hello6(int a, int b) {            we cannot take default modifier if we give public modifier in parent class
//    return a + b;                       otherwise we get compile time error
//}

    public int hello7(int a, int b) {
        return a + b;
    }

//    protected int hello8(int a, int b) {            we cannot take protected modifier if we give public modifier in parent class
//        return a + b;                               otherwise we get compile time error
//    }


    public static void main(String[] args) {
        Overloading overloading = new Overriding();
        System.out.println(overloading.hello(10, 20));
    }

}
