package RajshriPractice;

public class Methods {

    void instanceMethod(){
        System.out.println("Instance method");
    }
    static void staticMethod(){
        System.out.println("static method");
    }
    void m1(int a){
        System.out.println("PIM");
    }
    static void m2(int b){
        System.out.println("PSM");
    }


    public static void main(String[] args) {
        Methods m=new Methods();
        m.instanceMethod();
        Methods.staticMethod();
        System.out.println("*********Parameterised method**********");
        m.m1(1);
        Methods.m2(2);
    }

}
