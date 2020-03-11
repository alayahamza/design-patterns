package com.example.abstract_factory;

public class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }

    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}
