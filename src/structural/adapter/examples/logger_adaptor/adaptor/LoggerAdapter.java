package structural.adapter.examples.logger_adaptor.adaptor;

import structural.adapter.examples.logger_adaptor.adaptee.ThirdPartyLogger;
import structural.adapter.examples.logger_adaptor.target.MyLogger;

public class LoggerAdapter implements MyLogger {
    private ThirdPartyLogger adaptee;
    public LoggerAdapter(ThirdPartyLogger adaptee)
    {
        this.adaptee = adaptee;
    }
    @Override
    public void log(String message) {
        adaptee.logMessage(message);
    }
}
