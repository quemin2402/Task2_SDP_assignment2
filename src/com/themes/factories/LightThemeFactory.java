package com.themes.factories;

import com.themes.components.button.Button;
import com.themes.components.checkbox.Checkbox;
import com.themes.components.button.LightButton;
import com.themes.components.checkbox.LightCheckbox;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
