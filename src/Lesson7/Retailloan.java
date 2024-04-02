package Lesson7;

public class Retailloan extends Loan{

    public Retailloan(long id, double amount) {
        super(id, amount);
    }

    public Retailloan() {
    }

    @Override
    public double getCommission() {
        return 5;
    }
}
