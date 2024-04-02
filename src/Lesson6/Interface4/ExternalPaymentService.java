package Lesson6.Interface4;

public class ExternalPaymentService implements PaymentService{
    @Override
    public void getPaymentType() {
        System.out.println("EXTERNAL");
    }

    @Override
    public void getPaymentCommission() {
        System.out.println("1.5");
    }
}
