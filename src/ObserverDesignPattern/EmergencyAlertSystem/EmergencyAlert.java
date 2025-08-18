package ObserverDesignPattern.EmergencyAlertSystem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyAlert implements Observable{
    private final PriorityQueue<Observer> priorityAlertQueue = new PriorityQueue<>(Comparator.comparingInt(Observer::getPriority));
    private String emergency;

    public void setEmergency(String emergency) {
        this.emergency = emergency;
        notifyEmergencyAlerts();
    }

    @Override
    public void registerEmergency(Observer alertObj) {
        priorityAlertQueue.add(alertObj);
    }

    @Override
    public void unregisterEmergency(Observer alertObj) {
        priorityAlertQueue.remove(alertObj);
    }

    @Override
    public void notifyEmergencyAlerts() {
        // Create a temporary queue to avoid Concurrent Modification
        PriorityQueue<Observer> temp = new PriorityQueue<>(priorityAlertQueue);
        while(!temp.isEmpty()) temp.poll().update(emergency);
    }
}
