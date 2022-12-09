package Array.Char_Reverse;

public class CharRev {
    public static void main(String[] args) {
        char[] array = {'Y','A','S','H'};
        for (int left = 0, right = array.length-1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]+" ");
        }
    }
}
