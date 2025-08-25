public class OvernightShipment implements CostCalculation {

    @Override
    public double calculateCost(double weight) {
        return 120 + 10*weight;
    }
}
