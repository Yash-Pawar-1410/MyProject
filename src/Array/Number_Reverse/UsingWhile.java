package Array.Number_Reverse;

public class UsingWhile {
    public static void main(String[] args) {
        int[] array={10,20,30};
        int left=0;
        int right= array.length-1;
        while (left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse of the array is");
        for (int index = 0; index < array.length ; index++) {
            System.out.println(array[index]+" at index "+index);
        }
    }
}
