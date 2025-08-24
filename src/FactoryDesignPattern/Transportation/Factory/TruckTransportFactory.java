package FactoryDesignPattern.Transportation.Factory;

import FactoryDesignPattern.Transportation.Transport;
import FactoryDesignPattern.Transportation.TruckTransport;

public class TruckTransportFactory extends TransportFactory{
    @Override
    public Transport createLogistic() {
        return new TruckTransport();
    }
}
