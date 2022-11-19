package Array.Number_Reverse;

public class UsingFor {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int left = 0;
        int right = array.length - 1;
        for (; left < right; left++, right--) {
            // we can also write for loop like this
            //for (int left=0, right= array.length-1; left <right ; left++,right--)
            int temp = array[left];
            array[left] = array[right];
            array[right] = array[temp];
        }
        System.out.println("Printing the reverse array");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index] + " at index " + index);
        }
    }
}
