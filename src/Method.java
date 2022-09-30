public class Method {
    int a=10;
    int b=20;
    public void  add() {
        int c = a + b;
        System.out.println(c);
    }

        public void  sub() {
            int d = a - b;
            System.out.println(d);
        }
        public  void string(){
        String str="hello";
            System.out.println(str);
        }
        public void Char(){
        char ch='a';
            System.out.println(ch);
            System.out.println((int)ch);
        }

    public static void main(String[] args) {
      Method a= new Method();
        System.out.println(a.a);
        System.out.println(a.b);
        a.add();
        a.sub();
        a.string();
       a.Char();


    }
}
