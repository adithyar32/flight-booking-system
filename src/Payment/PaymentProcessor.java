package Payment;
public class PaymentProcessor {
    public boolean processPayment(String cardNumber, double amount) {

        if (cardNumber.length() == 16) {
            System.out.println("Payment Successful for amount: $" + amount);
            return true;
        } else {
            System.out.println("Invalid card number.");
            return false;
        }
    }
}
