package AbstractFactoryDesignPattern.IOTFramework.Devices.AlexaDevices;

import AbstractFactoryDesignPattern.IOTFramework.SecurityCamera;

public class AlexaSecurityCamera implements SecurityCamera {
    @Override
    public void startRecording() {
        System.out.println("[ALEXA CAMERA] Recording ON...");
    }

    @Override
    public void stopRecording() {
        System.out.println("[ALEXA CAMERA] Recording OFF...");
    }
}
