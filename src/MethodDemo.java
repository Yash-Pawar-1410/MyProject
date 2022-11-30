public class MethodDemo {
    int a;
    int b;
    MethodDemo(int a,int b){
        this.a=a;
        this.b=b;
    }
    void m1(){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
       MethodDemo methodDemo=new MethodDemo(10,20);
       methodDemo.m1();
    }
}
