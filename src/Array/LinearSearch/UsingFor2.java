package Array.LinearSearch;

public class UsingFor2 {
    public static void main(String[] args) {
        int[] array = {22, 56, 26, 54};
        int key = 2;
        boolean isPresent = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                isPresent = true;
            }
        }
        System.out.println(isPresent?"it is present":"it is not present");
    }
}
