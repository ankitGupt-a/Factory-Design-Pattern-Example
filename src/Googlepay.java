public class Googlepay implements PaymentProcessor{
    public void pay(final double amount) {
        System.out.println("Using google-pay to pay the amount: " + amount);
    }
}
