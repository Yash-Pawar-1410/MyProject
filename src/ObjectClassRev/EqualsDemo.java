package ObjectClassRev;

public class EqualsDemo {
    int a;
    EqualsDemo(int a){
        this.a=a;
    }
    public static void main(String[] args) {
        EqualsDemo equalsDemo=new EqualsDemo(20);
        EqualsDemo equalsDemo1=new EqualsDemo(20);
        System.out.println(equalsDemo==equalsDemo1);
        System.out.println(equalsDemo==equalsDemo);
        System.out.println(equalsDemo1==equalsDemo1);
        System.out.println(equalsDemo.equals(equalsDemo1));
        System.out.println(equalsDemo.equals(equalsDemo));
        System.out.println(equalsDemo1.equals(equalsDemo1));
        equalsDemo=equalsDemo1;
        System.out.println(equalsDemo.equals(equalsDemo1));

    }
}
