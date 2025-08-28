package AbstractFactoryDesignPattern.IOTFramework.Devices.GoogleDevices;

import AbstractFactoryDesignPattern.IOTFramework.Light;

public class GoogleLight implements Light {
    @Override
    public void switchOn() {
        System.out.println("[GOOGLE LIGHT] Turn ON");
    }

    @Override
    public void switchOff() {
        System.out.println("[GOOGLE LIGHT] Turn OFF");
    }
}
