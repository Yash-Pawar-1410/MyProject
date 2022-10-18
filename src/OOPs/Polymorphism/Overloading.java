package OOPs.Polymorphism;

// defining multiple method with the
//  => same name
//  => different signature
//          - should be either different type of parameter
//          - or different number of parameter
//  => either in the same class
//  => or in the child class


public class Overloading {
    //should be either different type of parameter
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    private float add(float num1, float num2) {
        return (float) num1 + (float) num2;
    }
    // different number of parameter

    protected int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    final int add(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    //----------------------------------------------------------------------
    //----------------------------------------------------------------------

    int hello(int a, int b) {
        return a + b;
    }

    int hello1(int a, int b) {
        return a + b;
    }

    int hello2(int a, int b) {
        return a + b;
    }

    //-----------------------------------------------------------------
    //-----------------------------------------------------------------
    protected int hello3(int a, int b) {
        return a + b;
    }

    protected int hello4(int a, int b) {
        return a + b;
    }

    protected int hello5(int a, int b) {
        return a + b;
    }

//-----------------------------------------------------------------
//-----------------------------------------------------------------
    public int hello6(int a, int b) {
        return a + b;
    }

    public int hello7(int a, int b) {
        return a + b;
    }

    public int hello8(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading ad = new Overloading();
        System.out.println(ad.add(12, 65));
        System.out.println(ad.add(12.5f, 36.3f));
        System.out.println(ad.add(12, 56, 89));
        System.out.println(ad.add(78, 61, 4, 3));
    }
}
