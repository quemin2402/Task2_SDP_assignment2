package com.themes.factories;

import com.themes.components.button.Button;
import com.themes.components.checkbox.Checkbox;
import com.themes.components.button.DarkButton;
import com.themes.components.checkbox.DarkCheckbox;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
