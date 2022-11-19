package Array.String_Reverse;

public class UsingWhile {
    public static void main(String[] args) {
        String name = "yash pawar";
        char[] array = name.toCharArray();
        int left = 0, right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reverse of the string");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
        }
    }
}
