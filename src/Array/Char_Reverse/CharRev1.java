package Array.Char_Reverse;

public class CharRev1 {
    public static void main(String[] args) {
        char[] array = {'H', 'E', 'L', 'L', 'O'};
        for (int left = 0, right = array.length - 1; left < right; right--, left++){
            char temp=array[left];
            array[left]=array[right];
            array[right]=temp;
        }
        for (int index = 0; index < array.length ; index++) {
            System.out.print(array[index]+" ");
        }
    }
}
