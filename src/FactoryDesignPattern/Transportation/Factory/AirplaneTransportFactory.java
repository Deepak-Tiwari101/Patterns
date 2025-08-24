package FactoryDesignPattern.Transportation.Factory;

import FactoryDesignPattern.Transportation.AirplaneTransport;
import FactoryDesignPattern.Transportation.Transport;

public class AirplaneTransportFactory extends TransportFactory{
    @Override
    public Transport createLogistic() {
        return new AirplaneTransport();
    }
}
