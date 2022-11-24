package Default_Method.Demo2;

public class Main implements AA,BB {
    public static void main(String[] args) {
        Main main=new Main();
        main.m1();
    }
    @Override
    public void m1() {
        AA.super.m1();
        BB.super.m1();
    }
}
