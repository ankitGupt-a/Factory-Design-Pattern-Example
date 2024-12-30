public class Paypal implements PaymentProcessor{
    public void pay(final double amount) {
        System.out.println("Using paypal to pay the amount: " + amount);
    }
}
