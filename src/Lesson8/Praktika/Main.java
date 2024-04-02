package Lesson8.Praktika;

public class Main {
    public static void main(String[] args) {
        CorpLoan corpLoan = new CorpLoan(1L,1000);
        CorpCustomer customer = new CorpCustomer(123,"Mehemmed",corpLoan);
        System.out.println(calculateFinalCommissionForLoan(customer));

        RetailLoan retailLoan = new RetailLoan(1L,100);
        RetailCustomer retailCustomer= new RetailCustomer(1234,"Elvin",retailLoan);
        System.out.println(calculateFinalCommissionForLoan(retailCustomer));

    }

    private static double calculateFinalCommissionForLoan(Customer customer){
        return customer.getLoan().getAmount()*(customer.getLoan().getCommission()-customer.discountForLoanCommission())/100;

    }
}
