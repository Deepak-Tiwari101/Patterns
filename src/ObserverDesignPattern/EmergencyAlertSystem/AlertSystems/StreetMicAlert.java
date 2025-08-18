package ObserverDesignPattern.EmergencyAlertSystem.AlertSystems;

import ObserverDesignPattern.EmergencyAlertSystem.Observer;

public class StreetMicAlert implements Observer {
    @Override
    public void update(String emergency) {
        System.out.println("[MIC ALERT] - EMERGENCY: " + emergency);
    }

    @Override
    public int getPriority() {
        return 3;
    }
}
