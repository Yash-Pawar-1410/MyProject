package Array.Number_Reverse;

public class UsingWhile1 {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int left=0;
        int right= array.length-1;
        while (left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse array is");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]+" at index "+index);
        }
    }
}
