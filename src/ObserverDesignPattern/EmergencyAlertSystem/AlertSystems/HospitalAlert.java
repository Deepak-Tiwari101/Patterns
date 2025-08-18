package ObserverDesignPattern.EmergencyAlertSystem.AlertSystems;

import ObserverDesignPattern.EmergencyAlertSystem.Observer;

public class HospitalAlert implements Observer {
    @Override
    public void update(String emergency) {
        System.out.println("[HOSPITAL ALERT] - EMERGENCY: " + emergency);
    }

    @Override
    public int getPriority() {
        return 1;
    }
}
