public class ShippingCostCalculator {
    
    private ShipmentType factory = new ShipmentType();
    
    public double cost(Shipment shipment) {
        CostCalculation costCalculation = factory.checkShipmentType(shipment.getType());
        return costCalculation.calculateCost(shipment.getWeightKg());
    }
}
