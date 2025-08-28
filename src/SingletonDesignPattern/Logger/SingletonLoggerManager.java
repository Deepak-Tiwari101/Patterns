package SingletonDesignPattern.Logger;

public class SingletonLoggerManager {
    // Bill Pugh method for creating singleton pattern
    private SingletonLoggerManager() {
        // Prevent object creation using reflection
        if (SingletonHelper.INSTANCE != null) {
            throw new IllegalStateException("Singleton instance already created. Use getInstance() method.");
        }
    }

    private static class SingletonHelper {
        private static final ILogger INSTANCE = createLogger();

        private static ILogger createLogger() {
            LogFormatter formatter = new LogFormatter("yyyy-MM-dd HH:mm:ss");
            LogWriter writer = new LogWriter("application.log", true);
            System.out.println("Logger ready to be created...");
            return new ApplicationLogger(formatter, writer);
        }

    }
    public static ILogger getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
