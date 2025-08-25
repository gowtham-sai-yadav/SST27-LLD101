public class CalculateTax implements TaxCalculation{
    private double taxRate = 0.18;

    public void SetTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

     public double getTaxRate() {
        return taxRate;
    }

   @Override
   public double calculateTax(double amount) {
     return amount * taxRate;
   }

   @Override
   public double calculateTotalWithTax(double amount) {
     return amount + amount * taxRate;
   }
}