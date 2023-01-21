package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerLIst {
    public static void main(String[] args) {
        List <Integer> integerList=new ArrayList<>();
        integerList.add(65);
        integerList.add(13);
        integerList.add(78);
        integerList.add(54);
        integerList.forEach(System.out::println);
        System.out.println("********Sorted*******");
        Collections.sort(integerList);
        integerList.forEach(System.out::println);


    }
}
