package Array.MaxNo;

public class MaxNoDemo {
    public static void main(String[] args) {
        int[] array={53,95,89,74};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
