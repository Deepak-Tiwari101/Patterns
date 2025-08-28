package AbstractFactoryDesignPattern.IOTFramework.Devices.AlexaDevices;

import AbstractFactoryDesignPattern.IOTFramework.Light;

public class AlexaLight implements Light {
    @Override
    public void switchOn() {
        System.out.println("[ALEXA LIGHT] Turn ON");
    }

    @Override
    public void switchOff() {
        System.out.println("[ALEXA LIGHT] Turn OFF");
    }
}
