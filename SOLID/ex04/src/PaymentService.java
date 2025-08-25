
public class PaymentService {

    private PaymentManager paymentManager = new PaymentManager();

    public String pay(Payment p) {
        MakePayment makePayment = paymentManager.handlePaymentType(p.provider);
        makePayment.paymentInitiate(p.amount);
        return "Payment made successfully";
    }
}