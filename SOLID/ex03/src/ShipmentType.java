public class ShipmentType {
    
    public CostCalculation checkShipmentType(String shipmentType) {
        switch (shipmentType.toUpperCase()) {
            case "STANDARD":
                return new StandardShipment();
            case "EXPRESS":
                return new ExpressShipment();
            case "OVERNIGHT":
                return new OvernightShipment();
            default:
                throw new IllegalArgumentException("Unknown shipment type: " + shipmentType);
        }
    }
}
