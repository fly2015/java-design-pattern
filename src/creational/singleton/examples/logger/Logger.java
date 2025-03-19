package creational.singleton.examples.logger;

public final class Logger {
    private static class LoggerHolder
    {
        private static final Logger INSTANCE = new Logger();
    }

    private Logger() {
    }

    public static Logger getLogger() {
        return LoggerHolder.INSTANCE;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }


    public static void main(String[] args) {
        Logger.getLogger().log("Hello World!");
    }
}
