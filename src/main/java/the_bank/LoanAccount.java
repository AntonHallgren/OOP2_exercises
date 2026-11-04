package the_bank;

public class LoanAccount extends Account{

    private final double loanRate;

    public LoanAccount(String holder, double balance, double loanRate) {
        super(holder, balance);
        this.loanRate = loanRate;
    }

    @Override
    public void processMonth() {
        double loanInterest = getBalance() * loanRate;
        deposit(loanInterest);
        IO.println(String.format("%s: loan interest added", getHolder()));
    }
}
