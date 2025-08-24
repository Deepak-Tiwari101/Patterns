package FactoryDesignPattern.Transportation;

public interface Transport {
    void deliver();
    double calculateCost(double distanceInKiloMeters);
}
