package Class_Component;

public class Demo {

    public static void main(String[] args) {
        Product product=new Product();
        System.out.println(product);
        System.out.println("Assign actual values");
// replacing default values with actual values
//        product.productId=1;
//        product.productName="Laptop";
        product.setDimension(20, "laptop");
        System.out.println(Product.productId);
        System.out.println(Product.productName);
        System.out.println(Product.companyName);


    }
}
