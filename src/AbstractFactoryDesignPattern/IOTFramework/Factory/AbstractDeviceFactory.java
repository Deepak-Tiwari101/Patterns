package AbstractFactoryDesignPattern.IOTFramework.Factory;

import AbstractFactoryDesignPattern.IOTFramework.Light;
import AbstractFactoryDesignPattern.IOTFramework.SecurityCamera;
import AbstractFactoryDesignPattern.IOTFramework.Thermostat;

public interface AbstractDeviceFactory {
    Light createLight();
    Thermostat createThermostat();
    SecurityCamera createSecurityCamera();
}
