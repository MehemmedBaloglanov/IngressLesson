package Lesson7;

public class Corploan extends Loan{

    public Corploan(long id, double amount) {
        super(id, amount);
    }

    public Corploan() {
    }

    @Override
    public double getCommission() {
        return 1.2;
    }
}
