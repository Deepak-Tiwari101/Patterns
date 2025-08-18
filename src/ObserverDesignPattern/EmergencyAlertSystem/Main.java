package ObserverDesignPattern.EmergencyAlertSystem;

import ObserverDesignPattern.EmergencyAlertSystem.AlertSystems.HospitalAlert;
import ObserverDesignPattern.EmergencyAlertSystem.AlertSystems.PoliceAlert;
import ObserverDesignPattern.EmergencyAlertSystem.AlertSystems.StreetMicAlert;

public class Main {
    public static void main(String[] args) {
        EmergencyAlert alert = new EmergencyAlert();

        Observer hospital = new HospitalAlert();
        Observer police = new PoliceAlert();
        Observer streetMic = new StreetMicAlert();

        // registering emergency alert systems (In any order, the priority will be given to HOSPITAL -> POLICE -> STREET MIC)
        alert.registerEmergency(police);
        alert.registerEmergency(streetMic);
        alert.registerEmergency(hospital);

        alert.setEmergency("Earthquake of magnitude 7.1 in Delhi");

        System.out.println();

        // emergency message to be kept discreet
        alert.unregisterEmergency(streetMic);

        alert.setEmergency("UFO landed in Bihar 👾");
    }
}
