package Array.Char_Reverse;

public class UsingWhile {
    public static void main(String[] args) {
        char[] array = {'Y', 'A', 'S', 'H'};
        int left = 0, right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reverse of the character ");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index] + " at index " + index);
        }
    }
}
