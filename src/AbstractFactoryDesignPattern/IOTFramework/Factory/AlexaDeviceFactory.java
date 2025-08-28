package AbstractFactoryDesignPattern.IOTFramework.Factory;

import AbstractFactoryDesignPattern.IOTFramework.Devices.AlexaDevices.AlexaLight;
import AbstractFactoryDesignPattern.IOTFramework.Devices.AlexaDevices.AlexaSecurityCamera;
import AbstractFactoryDesignPattern.IOTFramework.Devices.AlexaDevices.AlexaThermostat;
import AbstractFactoryDesignPattern.IOTFramework.Light;
import AbstractFactoryDesignPattern.IOTFramework.SecurityCamera;
import AbstractFactoryDesignPattern.IOTFramework.Thermostat;

public class AlexaDeviceFactory implements AbstractDeviceFactory{
    @Override
    public Light createLight() {
        return new AlexaLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new AlexaThermostat();
    }

    @Override
    public SecurityCamera createSecurityCamera() {
        return new AlexaSecurityCamera();
    }
}
