package com.themes.factories;

import com.themes.components.button.Button;
import com.themes.components.checkbox.Checkbox;

public interface ThemeFactory {
    Button createButton();
    Checkbox createCheckbox();
}
