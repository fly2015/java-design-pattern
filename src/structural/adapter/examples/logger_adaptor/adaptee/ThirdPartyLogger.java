package structural.adapter.examples.logger_adaptor.adaptee;

public class ThirdPartyLogger implements ThirdPartyLoggerInterface {
    public void logMessage(String message) {
        System.out.println("LoggerAdaptee: " + message);
    }
}
