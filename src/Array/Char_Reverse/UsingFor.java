package Array.Char_Reverse;

public class UsingFor {
    public static void main(String[] args) {
        char[] array = {'Y', 'A', 'S', 'H'};
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        System.out.println("Reverse of character");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index] + " at index " + index);
        }
    }
}
