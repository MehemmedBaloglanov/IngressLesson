package Lesson8.Praktika;

public class CorpLoan extends Loan  {

    public CorpLoan() {
    }

    public CorpLoan(long ID, double amount) {
        super(ID, amount);
    }

    @Override
    public double getCommission() {
        return 1.2;
    }
}
