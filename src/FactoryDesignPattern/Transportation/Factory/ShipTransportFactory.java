package FactoryDesignPattern.Transportation.Factory;

import FactoryDesignPattern.Transportation.ShipTransport;
import FactoryDesignPattern.Transportation.Transport;

public class ShipTransportFactory extends TransportFactory{
    @Override
    public Transport createLogistic() {
        return new ShipTransport();
    }
}
