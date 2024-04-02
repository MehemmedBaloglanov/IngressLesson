package Lesson7;

public class SMELoan extends Loan{

    public SMELoan(long id, double amount) {
        super(id, amount);
    }

    public SMELoan() {
    }

    @Override
    public double getCommission() {
        return 3;
    }
}
