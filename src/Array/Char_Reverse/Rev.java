package Array.Char_Reverse;

public class Rev {
    public static void main(String[] args) {
        char[] array = {'y', 'a', 's', 'h'};
        for (int left = 0, right = array.length-1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        System.out.println("Reverse of the char");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index] + " at index " + index);
        }
    }
}
