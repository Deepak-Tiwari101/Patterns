package FactoryDesignPattern.Transportation;

public class AirplaneTransport implements Transport{
    @Override
    public void deliver() {
        System.out.println("[Airplane] Delivering Product via air");
    }

    @Override
    public double calculateCost(double distanceInKiloMeters) {
        if (distanceInKiloMeters < 0) throw new IllegalArgumentException("No distance can be negative, but your IQ can :)");
        return distanceInKiloMeters * 1.5;
    }
}
