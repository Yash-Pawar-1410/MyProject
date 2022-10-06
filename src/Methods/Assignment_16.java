// create a class named 'PrintNumber' to print various number of different data types by creating different methods with the same name 'printn'
// having a parameter for each datatype
package Methods;

public class Assignment_16 {
   public static void printn (byte x){
        System.out.println(x);
    }
    public static  void printn1 (short y){
        System.out.println(y);
    }
    public static void printn2 (int z){
        System.out.println(z);
    } public static void printn3 (long x1){
        System.out.println(x1);
    }public static void printn4 (float y1){
        System.out.println(y1);
    }public static void printn5 (double z1){
        System.out.println(z1);
    }

    public static void main(String[] args) {
      Assignment_16.printn((byte) 10);
      Assignment_16.printn1((short) 11);
      Assignment_16.printn2(12);
      Assignment_16.printn3(13);
      Assignment_16.printn4(14);
      Assignment_16.printn5(15);
    }
}
