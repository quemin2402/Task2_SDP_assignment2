package com.themes;

import com.themes.components.button.Button;
import com.themes.components.checkbox.Checkbox;
import com.themes.factories.DarkThemeFactory;
import com.themes.factories.LightThemeFactory;
import com.themes.factories.ThemeFactory;

public class Main {
    public static void main(String[] args) {
        ThemeFactory lightThemeFactory = new LightThemeFactory();
        Button lightButton = lightThemeFactory.createButton();
        Checkbox lightCheckbox = lightThemeFactory.createCheckbox();

        lightButton.display();
        lightCheckbox.display();

        ThemeFactory darkThemeFactory = new DarkThemeFactory();
        Button darkButton = darkThemeFactory.createButton();
        Checkbox darkCheckbox = darkThemeFactory.createCheckbox();

        darkButton.display();
        darkCheckbox.display();
    }
}
