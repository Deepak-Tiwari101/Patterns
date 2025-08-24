package FactoryDesignPattern.Transportation.Factory;

import FactoryDesignPattern.Transportation.Transport;

public abstract class TransportFactory {
    protected abstract Transport createLogistic();

    public void sendDelivery(double distanceInKm) {
        Transport transport = createLogistic();
        transport.deliver();
        System.out.println("Cost: $" + transport.calculateCost(distanceInKm));
    }
}
