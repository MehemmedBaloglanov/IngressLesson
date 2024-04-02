package Lesson6.Interface4;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new InternalPaymentService();
        paymentService.getPaymentCommission();
        paymentService.getPaymentType();

        test(new InternalPaymentService());
        test(new ExternalPaymentService());
    }

    static void test(PaymentService paymentService){
        paymentService.getPaymentType();
        paymentService.getPaymentCommission();
    }
}
