package ObserverDesignPattern.EmergencyAlertSystem;

public interface Observer {
    void update(String emergency);
    int getPriority();  // priority based notification sending mechanism
}
