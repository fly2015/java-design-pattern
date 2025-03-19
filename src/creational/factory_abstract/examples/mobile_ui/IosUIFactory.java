package creational.factory_abstract.examples.mobile_ui;

import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileButton;
import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileText;
import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileWindow;
import creational.factory_abstract.examples.mobile_ui.concrete_component.IosButton;
import creational.factory_abstract.examples.mobile_ui.concrete_component.IosText;
import creational.factory_abstract.examples.mobile_ui.concrete_component.IosWindow;

public class IosUIFactory implements  MobileUIFactory{
    @Override
    public MobileText createMobileText() {
        return new IosText();
    }

    @Override
    public MobileButton createMobileButton() {
        return new IosButton();
    }

    @Override
    public MobileWindow creatMobileWindow() {
        return new IosWindow();
    }
}
