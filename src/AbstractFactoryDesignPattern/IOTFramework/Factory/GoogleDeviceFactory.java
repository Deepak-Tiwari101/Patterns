package AbstractFactoryDesignPattern.IOTFramework.Factory;

import AbstractFactoryDesignPattern.IOTFramework.Devices.GoogleDevices.GoogleLight;
import AbstractFactoryDesignPattern.IOTFramework.Devices.GoogleDevices.GoogleSecurityCamera;
import AbstractFactoryDesignPattern.IOTFramework.Devices.GoogleDevices.GoogleThermostat;
import AbstractFactoryDesignPattern.IOTFramework.Light;
import AbstractFactoryDesignPattern.IOTFramework.SecurityCamera;
import AbstractFactoryDesignPattern.IOTFramework.Thermostat;

public class GoogleDeviceFactory implements AbstractDeviceFactory{
    @Override
    public Light createLight() {
        return new GoogleLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new GoogleThermostat();
    }

    @Override
    public SecurityCamera createSecurityCamera() {
        return new GoogleSecurityCamera();
    }
}
