public class ExpressShipment implements CostCalculation {

    @Override
    public double calculateCost(double weight) {
        return 80 + 8*weight;
    }
}
