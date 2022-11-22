package Array.Duplicate;

public class Demo1 {
    public static void main(String[] args) {
        int[] array={10,1,2,4,1};
        boolean found=false;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[i]==array[j]&&i!=j){
                    found=true;
                    break;
                }
            }
            if (found==true){
                break;
            }
        }
        System.out.println(found?"duplicate number is found":"duplicate number is not found");
    }
}
