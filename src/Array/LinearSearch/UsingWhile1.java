package Array.LinearSearch;

public class UsingWhile1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int key = 2;
        boolean isPresent = false;
        int index = 0;
        while (index < array.length) {
            if (array[index] == key) {
                isPresent = true;
                break;
            }
            index++;
        }
        System.out.println(isPresent ? "it is present" : "it is not present");
    }

}
