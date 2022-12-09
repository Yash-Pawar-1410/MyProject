package Array.Array_Equal;

public class EqualDemo {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        int[] array1 = {10, 20, 30};
        System.out.println("array is equal " + equalsArray(array, array1));
    }

    private static boolean equalsArray(int[] array, int[] array1) {
        if (array == null || array1 == null) {
            return false;
        }
        if (array.length != array1.length) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array1[i]) {
                return false;
            }
        }
        return true;
    }
}
