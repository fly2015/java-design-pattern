package creational.factory_abstract.examples.mobile_ui;

import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileButton;
import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileText;
import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileWindow;
import creational.factory_abstract.examples.mobile_ui.concrete_component.AndroidButton;
import creational.factory_abstract.examples.mobile_ui.concrete_component.AndroidText;
import creational.factory_abstract.examples.mobile_ui.concrete_component.AndroidWindow;

public class AndroidUIFactory implements MobileUIFactory{
    @Override
    public MobileText createMobileText() {
        return new AndroidText();
    }

    @Override
    public MobileButton createMobileButton() {
        return new AndroidButton();
    }

    @Override
    public MobileWindow creatMobileWindow() {
        return new AndroidWindow();
    }
}
