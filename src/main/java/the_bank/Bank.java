package the_bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private final List<Account> accounts = new ArrayList<>();

    public Bank(String name)
    {
        this.name = name;
    }

    public void addAccount(Account account)
    {
        accounts.add(account);
    }

    public void processAllAccounts()
    {
        for(Account account : accounts)
        {
            account.processMonth();
        }
    }

    public void printAllSummaries()
    {
        for(Account account : accounts)
        {
            account.printSummary();
        }
    }

    static void main()
    {
        Bank bank = new Bank("Lexicon Bank");
        bank.addAccount(new SavingsAccount("Saver", 1000, 0.02));
        bank.addAccount(new CheckingAccount("Checker", 500, 25));
        bank.addAccount(new LoanAccount("Loaner", 5000, 0.03));
        bank.printAllSummaries();
        bank.processAllAccounts();
        bank.printAllSummaries();
    }
}
