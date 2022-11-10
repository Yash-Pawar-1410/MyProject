package ObjectClass;

public class GetClassMethodDemo {
    public static void main(String[] args) {
        GetClassMethodDemo getClassMethodDemo=new GetClassMethodDemo();
        Class aClass=getClassMethodDemo.getClass();
        System.out.println(aClass.getName());
    }

}
