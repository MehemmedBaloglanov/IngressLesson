package Lesson8.Praktika;

public class RetailLoan extends Loan{
    public RetailLoan() {
    }

    public RetailLoan(long ID, double amount) {
        super(ID, amount);
    }

    @Override
    public double getCommission() {
        return 5.0;
    }

}
