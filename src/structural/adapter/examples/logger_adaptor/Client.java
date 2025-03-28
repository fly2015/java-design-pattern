package structural.adapter.examples.logger_adaptor;

import structural.adapter.examples.logger_adaptor.adaptee.ThirdPartyLogger;
import structural.adapter.examples.logger_adaptor.adaptor.LoggerAdapter;

public class Client {
    public static void main(String[] args) {
        LoggerAdapter loggerAdapter = new LoggerAdapter(new ThirdPartyLogger());
        loggerAdapter.log("Use adapter to adapt third party logger");
    }
}
