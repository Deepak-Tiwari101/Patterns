package FactoryDesignPattern.Transportation;

public class TruckTransport implements Transport{
    @Override
    public void deliver() {
        System.out.println("[TRUCK] Delivering Product via road");
    }

    @Override
    public double calculateCost(double distanceInKiloMeters) {
        if (distanceInKiloMeters < 0) throw new IllegalArgumentException("No distance can be negative, but your IQ can :)");
        return distanceInKiloMeters * 0.5;
    }
}
