public class WalletPayment implements MakePayment {

    
    @Override
    public void paymentInitiate(double amount) {
        System.out.println("Wallet payment: " + amount);
    }
}