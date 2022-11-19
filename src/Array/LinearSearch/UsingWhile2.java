package Array.LinearSearch;

public class UsingWhile2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        int num = 40;
        boolean isPresent = false;
        int index = 0;
        while (index < array.length) {
            if (num == array[index]) {
                isPresent = true;
                break;
            }
            index++;
        }
        System.out.println(isPresent ? "it is present" : "it is not present");
    }
}
