package Array.Array_Copy;

public class Copy {
    public static void main(String[] args) {
        int [] array={10,20,30,40};
        int [] copy=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
            System.out.println("original array is "+array[i]);
        }
        System.out.println(array.hashCode());
        System.out.println("***********************");
        for (int i = 0; i < array.length ; i++) {
            System.out.println("copy of the array is "+copy[i]);
        }
        System.out.println(copy.hashCode());
    }
}
