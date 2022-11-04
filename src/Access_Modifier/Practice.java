package Access_Modifier;

public class Practice {
    int Id;
    public int Price;
    private String Name;
    protected String Company;



    void m1(int id,int price,String name,String company){
        Id=id;
        Price=price;
        Name=name;
        Company=company;
    }

    public static void main(String[] args) {
        Practice practice=new Practice();
        practice.m1(6954,96000,"Ideapad320","Lenovo");
        System.out.println(practice.Id);
    }

}
