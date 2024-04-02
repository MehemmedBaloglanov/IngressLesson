package Lesson7;

public class SMECustomer extends Customer{
    public SMECustomer(long id, String name, SMELoan smeLoan) {
        super(id, name, smeLoan);
    }

    public SMECustomer() {
    }

    @Override
    public double getDiscountForLoanCommission() {
        return 1;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
