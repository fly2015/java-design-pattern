package creational.factory_abstract.examples.mobile_ui;

public class Client {
    public static void main(String[] args) {
        MobileUIFactory iosUIFactory = new IosUIFactory();
        iosUIFactory.createMobileText().getText();
        iosUIFactory.createMobileButton().getMobileButton();
        iosUIFactory.creatMobileWindow().buildMobileWindow();

        MobileUIFactory androidUIFactory = new AndroidUIFactory();
        androidUIFactory.createMobileText().getText();
        androidUIFactory.createMobileButton().getMobileButton();
        androidUIFactory.creatMobileWindow().buildMobileWindow();
    }

}
