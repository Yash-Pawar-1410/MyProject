package LambdaExpression;
 interface Additon{
     int add(int num1,int num2);
 }
 class AddImp implements Additon{

     @Override
     public int add(int num1, int num2) {
         return num1+num2;
     }
 }
public class hello {
    public static void main(String[] args) {
        Additon way1=new AddImp();
        System.out.println(way1.add(10,10));
        //---------------------------------------------------------------
        Additon way2=new Additon() {
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };
        System.out.println(way2.add(10,20));
        //----------------------------------------------------------------
        Additon lambda=(num1, num2) -> num1+num2;
        System.out.println(lambda.add(20,20));
    }
}
