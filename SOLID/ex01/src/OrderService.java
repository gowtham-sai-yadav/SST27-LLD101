public class OrderService  {
    EmailClient email = new EmailClient();
    TaxCalculation taxCalculation = new CalculateTax();


    

    void checkout(String customerEmail, double subtotal) {    
        double total = taxCalculation.calculateTotalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }


}
