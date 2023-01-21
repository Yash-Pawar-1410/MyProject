package Collection;

import java.util.ArrayList;
import java.util.List;

public class AccountSorting {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        Account account1 = new Account(21, "A", 54500);
        Account account2 = new Account(2, "B", 50000);
        Account account3 = new Account(42, "BH", 556000);
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        // account whose accountBalance is greater than 520000
        for (Account account:accountList) {
            if (account.getAccountBalance()>=52000){
                System.out.println(account);
            }
        }
        // java 8 way
        System.out.println("java 8 way");
        accountList.stream().filter(account -> account.getAccountBalance()>=52000).forEach(System.out::println);

        // java 7 way to remove
//        System.out.println(" java 7 way to remove ");
        for (Account account:accountList) {
            if (account.getAccountNumber()==21){
               // accountList.remove(account);
            }
        }
        System.out.println("Remove ");
        accountList.removeIf(account -> account.getAccountNumber()==21);
        for (Account account:accountList) {
            System.out.println(account);
        }
    }
}
