public class PaymentManager {

    MakePayment handlePaymentType(String Provider) {
        switch (Provider) {
            case "CARD":
                return new CardPayment();
            case "UPI":
                return new UPIPayment();
            case "WALLET":
                return new WalletPayment();
        }
        throw new RuntimeException("No provider");
    }
}