package ObjectClassRev;

public class CloneDemo implements Cloneable {
    int a;
    int b;
    CloneDemo (int a ,int b){
        this.a=a;
        this.b=b;
    }
    void m1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDemo original=new CloneDemo(10,20);
        original.m1();
        CloneDemo copy=original;
        copy.a=30;
        copy.b=40;
        copy.m1();
        System.out.println(original.hashCode());
        System.out.println(copy.hashCode());

        CloneDemo clone= (CloneDemo) original.clone();
        clone.a=50;
        clone.b=60;
        clone.m1();
        System.out.println(original.hashCode());
        System.out.println(clone.hashCode());

    }
}

