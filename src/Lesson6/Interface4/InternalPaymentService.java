package Lesson6.Interface4;

public class InternalPaymentService implements PaymentService{
    @Override
    public void getPaymentType() {
        System.out.println("INTERNAL");
    }

    @Override
    public void getPaymentCommission() {
        System.out.println("1.0");
    }
}
