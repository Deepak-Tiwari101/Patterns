package AbstractFactoryDesignPattern.IOTFramework;

import AbstractFactoryDesignPattern.IOTFramework.Factory.AbstractDeviceFactory;
import AbstractFactoryDesignPattern.IOTFramework.Factory.AlexaDeviceFactory;
import AbstractFactoryDesignPattern.IOTFramework.Factory.GoogleDeviceFactory;


public class Main {
    public static void main(String[] args) {
        System.out.println("Creating devices using Alexa Factory...");
        AbstractDeviceFactory alexaFactory = new AlexaDeviceFactory();
        DeviceManager alexaDeviceManager = new DeviceManager(alexaFactory);

        Light alexaLight = alexaDeviceManager.createLight();
        Thermostat alexaThermostat = alexaDeviceManager.createThermostat();
        SecurityCamera alexaCamera = alexaDeviceManager.createSecurityCamera();

        alexaLight.switchOn();
        alexaThermostat.setTemperature(22);
        alexaThermostat.getTemperature();
        alexaCamera.startRecording();

        System.out.println("\nCreating devices using Google Factory...");
        AbstractDeviceFactory googleFactory = new GoogleDeviceFactory();
        DeviceManager googleDeviceManager = new DeviceManager(googleFactory);

        Light googleLight = googleDeviceManager.createLight();
        Thermostat googleThermostat = googleDeviceManager.createThermostat();
        SecurityCamera googleCamera = googleDeviceManager.createSecurityCamera();

        googleLight.switchOn();
        googleThermostat.setTemperature(24);
        googleThermostat.getTemperature();
        googleCamera.startRecording();
    }
}
