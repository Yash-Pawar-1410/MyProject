package Array.String_Reverse;

public class Rev {
    public static void main(String[] args) {
        String str="Yash";
        char[] array=str.toCharArray();
        for (int left = 0,right= array.length-1; left < right ; left++,right--) {
            char temp=array[right];
            array[right]=array[left];
            array[left]=temp;
        }
        System.out.println("Reverse of the string");
        for (int index = 0; index < array.length ; index++) {
            System.out.println(array[index]+" at index "+index);
        }
    }
}
