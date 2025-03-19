package creational.factory_abstract.examples.mobile_ui.concrete_component;

import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileText;

public class IosText implements MobileText {
    @Override
    public void getText() {
        System.out.println("Get Ios Text");
    }
}
