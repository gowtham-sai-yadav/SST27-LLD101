public class StandardShipment implements CostCalculation {

    @Override
    public double calculateCost(double weight) {
        return 50 + 5*weight;
    }
}
