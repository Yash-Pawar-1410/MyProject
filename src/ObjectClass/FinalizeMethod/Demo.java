package ObjectClass.FinalizeMethod;

// it is method preset inside the object class which is used for cleanup the code
// finalize() method will be call by garbage collector just before object get deleted
// Garbage => it is unused or unreferenced objects
// Garbage Collector => it is a background thread which cleans or frees the unused or unreferenced object
public class Demo {
    int a;
    int b;

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void m1(){
        System.out.println(a);
        System.out.println(b);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is deleted");
    }

    public static void main(String[] args) {
        Demo demo=new Demo(20,30);
        demo.m1();
        System.out.println(demo.hashCode());
        Demo demo1=new Demo(40,50);
        demo1.m1();
        demo=null;
        System.gc();

    }
}
