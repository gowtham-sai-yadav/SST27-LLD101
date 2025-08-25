public class UPIPayment implements MakePayment {
    @Override
    public void paymentInitiate(double amount) {
        System.out.println("UPIPayment: " + amount);
    }
}