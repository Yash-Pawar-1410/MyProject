public class ConsRev {
   int a;
   int b;
   ConsRev(int a, int b){
      this.a=a;
      this.b=b;
   }

   void  m1(){
       System.out.println(a+b);
   }

    public static void main(String[] args) {
        ConsRev consRev=new ConsRev(20,30);
        ConsRev consRev1=new ConsRev(30,40);
        //new ConsRev(50,52); till java 7
        consRev.m1();
        consRev1.m1();
    }
}
