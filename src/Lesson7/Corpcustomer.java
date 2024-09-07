package Lesson7;

public class Corpcustomer extends Customer {

    public Corpcustomer(long id, String name,Corploan corploan) {
        super(id, name, corploan);
    }

    public Corpcustomer() {
    }

    @Override
    public double getDiscountForLoanCommission() {
        return 0.5;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
