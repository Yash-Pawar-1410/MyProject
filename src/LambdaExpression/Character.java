package LambdaExpression;

interface Char{
    char chara(char ch1, char ch2);
}

class CharImp implements Char{

    @Override
    public char chara(char ch1, char ch2) {
        return (char) (ch1+ch2);
    }
}


public class Character {
    public static void main(String[] args) {
        Char char1=new CharImp();
        System.out.println(char1.chara('A','A'));
        //--------------------------------------------------------
        Char char2=new Char() {
            @Override
            public char chara(char ch1, char ch2) {
                return (char) (ch1+ch2);
            }
        };
        System.out.println(char2.chara('a','a'));
        //-------------------------------------------------------
        Char lambda=(ch1,ch2)-> (char) (ch1+ch2);
        System.out.println(lambda.chara('a','A'));
    }

}
