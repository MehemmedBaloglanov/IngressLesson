package Lesson7;

public class Main {
    public static void main(String[] args) {

        Corploan corploan = new Corploan(1L,100);
        Corpcustomer corpcustomer = new Corpcustomer(1L,"Mehemmed",corploan);
        System.out.println("Final commission for corp customer: " + calculateFinalCommissionForLoan(corpcustomer));


        Retailloan retailloan = new Retailloan(1L,100);
        Retailcustomer retailcustomer = new Retailcustomer(1L,"Mehemmed",retailloan);
        System.out.println("Final commission for retail customer: " + calculateFinalCommissionForLoan(retailcustomer));
//
        SMELoan smeLoan = new SMELoan(1L,100);
        SMECustomer smeCustomer = new SMECustomer(1L,"mehemmed",smeLoan);
        System.out.println("Final commission for sme customer: " + calculateFinalCommissionForLoan(smeCustomer));
    }

    private static double calculateFinalCommissionForLoan(Customer customer){
        return customer.getLoan().getAmount()*(customer.getLoan().getCommission()-customer.getDiscountForLoanCommission())/100;
    }

    //100*(1.2-0.5)/100=0.7

}
