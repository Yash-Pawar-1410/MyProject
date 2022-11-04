package Access_Modifier;

public class Product {
    private  int productId;
    public String productName;
    static String  productCompany;
    protected int productPrice;

    public void setValue (int productId, String productName, String productCompany, int productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productCompany=productCompany;
        this.productPrice=productPrice;
    }


}
