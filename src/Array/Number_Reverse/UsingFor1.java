package Array.Number_Reverse;

public class UsingFor1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index] + " at index " + index);
        }
    }
}
