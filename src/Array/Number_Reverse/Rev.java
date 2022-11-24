package Array.Number_Reverse;

public class Rev {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        for (int left = 0,righ= array.length-1; left < righ; left++,righ--) {
            int temp=array[righ];
            array[righ]=array[left];
            array[left]=temp;
        }
        System.out.println("Reverse the array is");
        for (int indx = 0; indx < array.length ; indx++) {
            System.out.println(array[indx]+ " at index "+indx);
        }
    }
}
