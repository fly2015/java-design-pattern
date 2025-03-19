package creational.factory_abstract.examples.mobile_ui.concrete_component;

import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileButton;

public class AndroidButton implements MobileButton {
    @Override
    public void getMobileButton() {
        System.out.println("Get Android Button");
    }
}
