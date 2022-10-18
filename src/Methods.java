public class Methods {
    int a=10;
    static int b=20;
    //what is method= method is a group statement enclose by curly braces which accept input and return output
    // why we use method = for code re-usability and to perform logic and operation and to make readable and understandable code
    void m1(){
        System.out.println("This is a instance method");
    }
     static void m2(){
        System.out.println("this is a static method");
    }

    public static void main(String[] args) {
        Methods methods=new Methods();
        methods.m1(); // we access the instance method with the help  of reference
        m2(); // we access the static method with the help of class name
    }
}
