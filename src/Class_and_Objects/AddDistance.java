// Assignment 10
// add two distance in inch-feet  by creating a class named 'AddDistance

package Class_and_Objects;

public class AddDistance {
    float addDistance(float distance1,float distance2){
        return distance1+distance2;
    }

    public static void main(String[] args) {
        AddDistance addDistance=new AddDistance();
        System.out.println("the distance is "+addDistance.addDistance(4.5f,5.4f));
    }





}
