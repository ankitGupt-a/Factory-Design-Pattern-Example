public class PaymentProcessorFactory {
    public static PaymentProcessor getPaymentProcessor(final String type) {
        return switch (type.toLowerCase()) {
            case "googlepay" -> new Googlepay();
            case "creditcard" -> new CreditCard();
            case "paypal" -> new Paypal();
            default -> throw new IllegalArgumentException("Unsupported payment type");
        };
    }
}
