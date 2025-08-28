package AbstractFactoryDesignPattern.IOTFramework;

import AbstractFactoryDesignPattern.IOTFramework.Factory.AbstractDeviceFactory;

public class DeviceManager {
    private final AbstractDeviceFactory factory;

    public DeviceManager(AbstractDeviceFactory factory) {
        this.factory = factory;
    }
    public Light createLight() {
        return factory.createLight();
    }
    public Thermostat createThermostat() {
        return factory.createThermostat();
    }
    public SecurityCamera createSecurityCamera() {
        return factory.createSecurityCamera();
    }
}
