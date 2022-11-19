package Array.LinearSearch;

public class UsingWhile {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        int key=4;
        boolean isPresent=false;
        int index=0;
        while (index < array.length ){
            if (key==array[index]) {
                isPresent = true;
                break;
            }
            index++;
        }
        System.out.println(isPresent?"it is present":"it is not present");
    }
}
