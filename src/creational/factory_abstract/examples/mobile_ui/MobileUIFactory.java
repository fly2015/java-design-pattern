package creational.factory_abstract.examples.mobile_ui;

import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileButton;
import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileText;
import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileWindow;

interface MobileUIFactory {
    MobileText createMobileText();
    MobileButton createMobileButton();
    MobileWindow creatMobileWindow();
}
