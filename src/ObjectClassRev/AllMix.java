package ObjectClassRev;

public class AllMix implements Cloneable {
  int a;
  int b;

  AllMix(int ab, int bc){
    a=ab;
    b=bc;
  }
  void m1(){
      System.out.println(a);
      System.out.println(b);
  }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object deleted");
    }

//    @Override
//    public String toString() {
//        return "AllMix{" +
//                "a=" + a +
//                ", b=" + b +
//                '}';
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        AllMix allMix =new AllMix(11,12);
        AllMix allMix1 =new AllMix(11,12);

        // getClass() Method
        System.out.println("getClass() Method");
        Class hello= allMix.getClass();
        System.out.println(hello.getName());
        System.out.println();

        // equals() Method
        System.out.println("equals() Method");
        System.out.println(allMix.equals(allMix1));
        System.out.println();

        // hashCode() Method
        System.out.println("hashCode() Method");
        System.out.println(allMix.hashCode());
        System.out.println(allMix1.hashCode());
        System.out.println("covert to hexDeci"+Integer.toHexString(allMix.hashCode()));
        System.out.println();

        // toString() Method
        // if we override the toString() Method values are printed
        System.out.println("toString() Method");
        System.out.println(allMix);
        System.out.println(allMix1);
        System.out.println();

        // finalize() Method
        System.out.println("finalize() Method");
        allMix=null;
        System.out.println("allMix is"+allMix);
        allMix1.m1();
        System.gc();
        System.out.println();

        // clone() Method
        // make copy of the original object
        AllMix copy=allMix1;
        copy.a=10;
        copy.b=20;
        allMix1.m1();
        copy.m1();
        System.out.println(allMix1.hashCode());
        System.out.println(copy.hashCode());
        System.out.println();

        // make clone of the original object
        AllMix clone=(AllMix) allMix1.clone();
        clone.a=100;
        clone.b=200;
        allMix1.m1();
        clone.m1();
        System.out.println(allMix1.hashCode());
        System.out.println(clone.hashCode());

    }

}
