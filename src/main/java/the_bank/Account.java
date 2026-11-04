package the_bank;


import java.security.InvalidParameterException;

public abstract class Account {
    private final String holder;
    private double balance;

    public Account(String holder, double balance)
    {
        if(holder == null || holder.isEmpty())
        {
            throw new InvalidParameterException("Empty string for name not allowed");
        }
        if(balance < 0)
        {
            throw new InvalidParameterException("Negative balance not allowed");
        }
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
        IO.println(String.format("%s | Balance: %.2f kr", holder, balance));
    }
}
