package AbstractFactoryDesignPattern.IOTFramework.Devices.GoogleDevices;

import AbstractFactoryDesignPattern.IOTFramework.SecurityCamera;

public class GoogleSecurityCamera implements SecurityCamera {
    @Override
    public void startRecording() {
        System.out.println("[GOOGLE CAMERA] Recording ON...");
    }

    @Override
    public void stopRecording() {
        System.out.println("[GOOGLE CAMERA] Recording OFF...");
    }
}
