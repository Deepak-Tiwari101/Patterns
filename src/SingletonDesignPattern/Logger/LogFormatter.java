package SingletonDesignPattern.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogFormatter {
    private final DateTimeFormatter formatter;
    public LogFormatter(String pattern) {
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }
    public String format(LogLevel logLevel, String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        return String.format("[%s] [%s] %s", timestamp, logLevel, message);
    }
}
