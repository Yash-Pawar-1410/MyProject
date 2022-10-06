public class Block {
    {
        System.out.println("instance block1");
        System.out.println("instance block2");
        System.out.println("instance block3");

    }
    static {
        System.out.println("static block");
    }
    static {
        System.out.println("static block1");
    }



    public static void main(String[] args) {
       Block block=new Block();
       Block block1=new Block();

    }
}
