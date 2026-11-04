package the_bank;


public abstract class Account {
    private String holder;
    private double balance;

    public Account(String holder, double balance)
    {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public abstract void processMonth();

    public void printSummary()
    {
        //TODO implement
    }
}
