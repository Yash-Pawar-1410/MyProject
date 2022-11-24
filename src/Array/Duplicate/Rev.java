package Array.Duplicate;

public class Rev {
    public static void main(String[] args) {
        int[] array={10,20,30};
        boolean isFound=false;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]==array[j]&&i!=j){
                    isFound=true;
                    break;
                }
            }
            if(isFound==true){
                break;
            }
        }
        System.out.println(isFound?"duplicate is found":"duplicate not a found");
    }
}
