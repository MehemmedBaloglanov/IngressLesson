package Lesson7;

public class Retailcustomer extends Customer{
    public Retailcustomer(long id, String name, Retailloan retailloan ) {
        super(id, name, retailloan);
    }

    public Retailcustomer() {
    }

    @Override
    public double getDiscountForLoanCommission() {
        return 2;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
