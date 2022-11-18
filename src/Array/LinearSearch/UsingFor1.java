package Array.LinearSearch;

public class UsingFor1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 3;
        boolean isPresent = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key)
                isPresent = true;
        }
        System.out.println(isPresent ? "it is present in the array" : "it is not present in the array");
    }
}
