package Array.String_Reverse;

public class UsingFor {
    public static void main(String[] args) {
        String name = "Yash Pawar";
        char[] array = name.toCharArray();
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
        }
    }
}
