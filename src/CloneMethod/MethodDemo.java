package CloneMethod;

public class MethodDemo {
    int a;
    int b;
    public MethodDemo(int a,int b){
        this.a=a;
        this.b=b;
    }
    void m1(){
        System.out.println("A is "+a);
        System.out.println("B is "+b);
    }

    public static void main(String[] args) {
        MethodDemo methodDemo=new MethodDemo(10,20);
        methodDemo.m1();
        MethodDemo original=methodDemo;
        original.a=30;
        original.b=40;
        original.m1();
        System.out.println(methodDemo.hashCode());
        System.out.println(original.hashCode());
        //****************************************************************
    }
}
