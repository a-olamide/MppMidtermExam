package shipment_system;

public sealed interface Shipment permits StandardShipment, ExpressShipment, OvernightShipment {
    String getTrackingDetails();
}
