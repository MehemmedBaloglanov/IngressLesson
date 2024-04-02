package Lesson8.Praktika;

public class CorpCustomer extends Customer{

    public CorpCustomer() {
    }

    public CorpCustomer(int ID, String name, CorpLoan corpLoan) {
        super(ID, name, corpLoan);
    }

    @Override
    public double discountForLoanCommission() {
        return 0.5;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
