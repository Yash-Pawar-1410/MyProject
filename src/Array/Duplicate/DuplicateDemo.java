package Array.Duplicate;

public class DuplicateDemo {
    public static void main(String[] args) {
        int[] array={10,20,10,30};
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
        System.out.println(found?"yes":"no");
    }
}
