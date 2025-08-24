package FactoryDesignPattern.Transportation;

import FactoryDesignPattern.Transportation.Factory.AirplaneTransportFactory;
import FactoryDesignPattern.Transportation.Factory.ShipTransportFactory;
import FactoryDesignPattern.Transportation.Factory.TransportFactory;

public class Main {
    public static void main(String[] args) {
        TransportFactory airFactory = new AirplaneTransportFactory();
        airFactory.sendDelivery(500);

        TransportFactory seaFactory = new ShipTransportFactory();
        seaFactory.sendDelivery(1200);
    }
}
