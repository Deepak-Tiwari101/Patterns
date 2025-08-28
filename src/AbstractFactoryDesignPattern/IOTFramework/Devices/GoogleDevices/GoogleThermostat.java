package AbstractFactoryDesignPattern.IOTFramework.Devices.GoogleDevices;

import AbstractFactoryDesignPattern.IOTFramework.Thermostat;

public class GoogleThermostat implements Thermostat {
    private int temperature;
    @Override
    public void turnOn() {
        System.out.println("[GOOGLE THERMOSTAT] Turn ON");
    }

    @Override
    public void turnOff() {
        System.out.println("[GOOGLE THERMOSTAT] Turn OFF");
    }

    @Override
    public void setTemperature(int temp_in_kelvin) {
        this.temperature = temp_in_kelvin;
    }

    @Override
    public void getTemperature() {
        System.out.println("[GOOGLE THERMOSTAT] Temperature: " + this.temperature + " degree Celsius");
    }
}
