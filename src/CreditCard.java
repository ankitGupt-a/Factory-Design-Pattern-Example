public class CreditCard implements PaymentProcessor{
    public void pay(final double amount) {
        System.out.println("Using credit-card to pay the amount: " + amount);
    }
}
