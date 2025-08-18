package ObserverDesignPattern.EmergencyAlertSystem;

public interface Observable {
    void registerEmergency(Observer alertObj);
    void unregisterEmergency(Observer alertObj);
    void notifyEmergencyAlerts();
}
