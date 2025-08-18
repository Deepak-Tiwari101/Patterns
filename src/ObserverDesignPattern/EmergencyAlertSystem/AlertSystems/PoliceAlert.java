package ObserverDesignPattern.EmergencyAlertSystem.AlertSystems;

import ObserverDesignPattern.EmergencyAlertSystem.Observer;

public class PoliceAlert implements Observer {
    @Override
    public void update(String emergency) {
        System.out.println("[POLICE ALERT] - EMERGENCY: " + emergency);
    }

    @Override
    public int getPriority() {
        return 2;
    }
}
