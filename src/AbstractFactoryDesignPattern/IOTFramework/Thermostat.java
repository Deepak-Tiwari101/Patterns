package AbstractFactoryDesignPattern.IOTFramework;

public interface Thermostat {
    void turnOn();
    void turnOff();
    void setTemperature(int temp_in_kelvin);
    void getTemperature();
}
