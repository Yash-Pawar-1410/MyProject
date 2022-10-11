package Access_Modifier;

public class ProductDemo {
    public static void main(String[] args) {
        Product product=new Product();
        product.setValue(10, "iPhone","apple",150000);

        // in same package but in different class public, default, protected access modifier are access

        // System.out.println(product.productId);   private are not access
        System.out.println(product.productName);
        System.out.println(Product.productCompany);
        System.out.println(product.productPrice);
    }
}
