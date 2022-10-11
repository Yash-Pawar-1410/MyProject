package Access_Modifier;

public class Product_1 {
    int proId;
    public String proName;
    private static String proCompany;
    protected int proPrice;

    void setProId(int proId) {
        this.proId = proId;
    }

    int getProId() {
        return proId;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProName() {
        return proName;
    }

    private void setProCompany(String proCompany) {
        Product_1.proCompany = proCompany;
    }

    private String getProCompany() {
        return proCompany;
    }

    protected void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    protected int getProPrice() {
        return proPrice;
    }

    public static void main(String[] args) {

        // in same class all access modifier are access

        Product_1 product_1 = new Product_1();
        product_1.setProId(10);
        product_1.setProName("ball");
        product_1.setProCompany("Tennis");
        product_1.setProPrice(15);
        System.out.println(product_1.getProId());
        System.out.println(product_1.getProId());
        System.out.println(product_1.getProName());
        System.out.println( product_1.getProCompany());
        System.out.println( product_1.getProPrice());



    }
}
