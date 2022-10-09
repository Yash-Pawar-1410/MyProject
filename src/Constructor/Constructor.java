package Constructor;

public class Constructor {
    int a;
    int b;

    public Constructor(int x, int y) {
        a = x;
        b = y;
    }
    int add(){
       return a+b;
    }

    public static void main(String[] args) {
        Constructor constructor=new Constructor(5,6);
        System.out.println(constructor.add());
    }
}

