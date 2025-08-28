package SingletonDesignPattern.Logger;

public class ApplicationLogger implements ILogger{
    private final LogFormatter formatter;
    private final LogWriter writer;

    public ApplicationLogger(LogFormatter formatter, LogWriter writer) {
        this.formatter = formatter;
        this.writer = writer;
    }

    @Override
    public synchronized void log(String message) {
        writer.write(formatter.format(LogLevel.LOG, message));
    }

    @Override
    public synchronized void error(String message) {
        writer.write(formatter.format(LogLevel.ERROR, message));
    }

    @Override
    public synchronized void info(String message) {
        writer.write(formatter.format(LogLevel.INFO, message));
    }

    @Override
    public synchronized void debug(String message) {
        writer.write(formatter.format(LogLevel.DEBUG, message));
    }
}
