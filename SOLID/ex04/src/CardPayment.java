public class CardPayment implements MakePayment {
    @Override
    public void paymentInitiate(double amount) {
        System.out.println("Card payment: " + amount);
    }
}