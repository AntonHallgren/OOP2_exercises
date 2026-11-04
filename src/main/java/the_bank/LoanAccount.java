package the_bank;

public class LoanAccount extends Account{

    private double loanRate;

    public LoanAccount(String holder, double balance, double loanRate) {
        super(holder, balance);
        this.loanRate = loanRate;
    }

    @Override
    public void processMonth() {
        //TODO implement
    }
}
