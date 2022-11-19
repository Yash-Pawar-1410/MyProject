package Array.Number_Reverse;

public class UsingFor2 {
    public static void main(String[] args) {
        int [] array={10,20,30,40};
        for (int left=0,right= array.length-1; left<right;left++,right--){
            int temp=array[right];
            array[right]=array[left];
            array[left]=temp;
        }
        System.out.println("Reverse of the array is");
        for (int index = 0; index < array.length ; index++) {
            System.out.println(array[index]+" at index "+index);
        }
    }
}
