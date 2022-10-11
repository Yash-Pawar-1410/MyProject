package Access_Modifier1;

import Access_Modifier.Product_1;

public class ProductDemo1 {
    public static void main(String[] args) {
        Product_1 product_1 = new Product_1();


        //  in different package only public access modifier are access


       // product_1.setProId(10);
        product_1.setProName("ball");
//        product_1.setProCompany("Tennis");
//        product_1.setProPrice(15);
//        System.out.println(product_1.getProId());
//        System.out.println(product_1.getProId());
        System.out.println(product_1.getProName());
//        System.out.println( product_1.getProCompany());
//        System.out.println( product_1.getProPrice());
    }
}
