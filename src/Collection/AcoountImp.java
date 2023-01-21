package Collection;

import java.util.ArrayList;
import java.util.List;

public class AcoountImp {
    public static void main(String[] args) {
        List <Account> accountList=new ArrayList();
        Account account=new Account(1325,"Yash",12000);
        Account account1=new Account(3541,"Neha",45166);
        Account account2=new Account(6951,"Harshada",79665);
        Account account3=new Account(4466,"Tina",468565);

        accountList.add(account);
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);

        for (Account ac:accountList) {
            if (ac.getAccountBalance()<=2000){
                System.out.println(ac);
            }
        }

        for (Account ac2 :accountList) {
            System.out.println(ac2);
        }




    }
}
