package Array.LinearSearch;

public class Rev {
    public static void main(String[] args) {
        int [] array={1,2,3,4};
        int key=5;
        boolean isPresent=false;
        for (int index = 0; index < array.length ; index++) {
            if (array[index]==key){
                isPresent=true;
                break;
            }
        }
        System.out.println(isPresent?key+" It is found":key+" It is not found");
    }
}
