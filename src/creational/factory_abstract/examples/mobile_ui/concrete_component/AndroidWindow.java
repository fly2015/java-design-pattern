package creational.factory_abstract.examples.mobile_ui.concrete_component;

import creational.factory_abstract.examples.mobile_ui.abstract_component.MobileWindow;

public class AndroidWindow implements MobileWindow {
    @Override
    public void buildMobileWindow() {
        System.out.println("Build Android Window");
    }
}
