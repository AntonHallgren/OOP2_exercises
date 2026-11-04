package the_bank;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void processMonth() {
        //TODO implement
    }
}
