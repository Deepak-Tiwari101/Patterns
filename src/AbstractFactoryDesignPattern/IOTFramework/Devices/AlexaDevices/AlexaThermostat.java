package AbstractFactoryDesignPattern.IOTFramework.Devices.AlexaDevices;

import AbstractFactoryDesignPattern.IOTFramework.Thermostat;

public class AlexaThermostat implements Thermostat {
    private int temperature;
    @Override
    public void turnOn() {
        System.out.println("[ALEXA THERMOSTAT] Turn ON");
    }

    @Override
    public void turnOff() {
        System.out.println("[ALEXA THERMOSTAT] Turn OFF");
    }

    @Override
    public void setTemperature(int temp_in_kelvin) {
        this.temperature = temp_in_kelvin;
    }

    @Override
    public void getTemperature() {
        System.out.println("[ALEXA THERMOSTAT] Temperature: " + this.temperature + " degree Celsius");
    }
}
