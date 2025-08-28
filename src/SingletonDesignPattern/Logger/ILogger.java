package SingletonDesignPattern.Logger;

public interface ILogger {
    void log(String message);
    void error(String message);
    void info(String message);
    void debug(String message);
}
