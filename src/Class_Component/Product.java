package Class_Component;

public class Product {
    // Instance variable
    static int productId;
    static String productName;
    // static variable
    static  String companyName="Amazon";

    void setDimension(int id, String name){
        //assign local variable values to the instance variable
        productId = id;
      productName=name;
    }
}
