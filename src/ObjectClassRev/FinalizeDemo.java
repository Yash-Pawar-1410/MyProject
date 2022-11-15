package ObjectClassRev;

public class FinalizeDemo {
    int a;
    FinalizeDemo(int a){
        this.a=a;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("object deleted");
    }

    public static void main(String[] args) {
        FinalizeDemo finalizeDemo=new FinalizeDemo(20);
        FinalizeDemo finalizeDemo1=new FinalizeDemo(20);
        FinalizeDemo finalizeDemo2=new FinalizeDemo(20);
        FinalizeDemo finalizeDemo3=new FinalizeDemo(20);
        finalizeDemo=null;
        finalizeDemo1=null;
        finalizeDemo2=null;
        finalizeDemo3=null;
        System.gc();
    }
}
