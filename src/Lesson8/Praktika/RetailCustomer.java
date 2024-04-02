package Lesson8.Praktika;

public class RetailCustomer extends Customer{

    public RetailCustomer() {
    }

    public RetailCustomer(int ID, String name, RetailLoan retailLoan) {
        super(ID, name, retailLoan);
    }

    @Override
    public double discountForLoanCommission() {
        return 2.0;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
