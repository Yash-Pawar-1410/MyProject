package Array.LinearSearch;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] array={10,20,30};
        int key=1;
        boolean isPresent=false;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]==key){
                isPresent=true;
                break;
            }
        }
        System.out.println(isPresent?"yes":"no");
    }
}
