public class Client {
    public static void main(String[] args) {
        final PaymentProcessor paymentProcessor = PaymentProcessorFactory.getPaymentProcessor("creditcard");
        paymentProcessor.pay(25);

        final PaymentProcessor paymentProcessor1 = PaymentProcessorFactory.getPaymentProcessor("GooglePay");
        paymentProcessor1.pay(30);

        final PaymentProcessor paymentProcessor2 = PaymentProcessorFactory.getPaymentProcessor("paypal");
        paymentProcessor2.pay(35);
    }
}