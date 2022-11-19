package Array.LinearSearch;

public class UsingFor {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 22;
        boolean isPresent = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent ? "Number is present in the array" : "Number does not present in the array");
    }
}
