package Nested_Class;

public class Demo {
    static class Mysql {
        static String username = "Mysql";
        static String password = "Admin";
    }

    static class Oracle {
        static String username = "Oracle";
        static String password = "Admin";
    }

    static class Prosgress {
        static class Dev {
            static String username = "Dev";
            static String password = "Admin";
        }

        static class Prod {
            static String username = "Prod";
            static String password = "Admin";
        }

    }
    public static void main(String[] args) {
        System.out.println(Demo.Mysql.username);
        System.out.println(Demo.Mysql.password);

        System.out.println(Demo.Oracle.username);
        System.out.println(Demo.Oracle.password);


        System.out.println(Demo.Prosgress.Prod.username);
        System.out.println(Demo.Prosgress.Prod.password);




        System.out.println(Demo.Prosgress.Dev.username);
        System.out.println(Demo.Prosgress.Dev.password);
    }
}
