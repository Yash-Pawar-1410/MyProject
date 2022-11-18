package Array.LinearSearch;

public class UsingWhile {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        int key=0;
        boolean isPresent=false;
        int index=0;
        while ( array[index]==key){
            isPresent=true;

            index++;
        }
        System.out.println(isPresent?"it is present":"it is not present");
    }
}
