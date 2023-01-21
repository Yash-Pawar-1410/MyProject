package Collection;


import java.util.ArrayList;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        // Container where we stored same type as well as different type of element
        List arrayList =new ArrayList();

        // we can add duplicates, any numbers of nulls, heterogeneous data
        // insertion order is maintained
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add("String");
        arrayList.add(null);
        arrayList.add(10.5d);
        arrayList.add(10.55f);
        arrayList.add(true);
        System.out.println(arrayList);
        System.out.println("***********************");

        // Remove single element
        boolean isRemoved= arrayList.remove(null);
        System.out.println("element remove "+isRemoved);
        System.out.println(arrayList);
        System.out.println("***********************");

        // number of elements
        System.out.println("Total elements are "+arrayList.size());
        System.out.println("***********************");
        System.out.println("element in collection "+arrayList.contains("string"));


    }
}
