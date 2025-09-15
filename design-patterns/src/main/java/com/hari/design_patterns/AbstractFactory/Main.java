package com.hari.design_patterns.AbstractFactory;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory;
        String os = "Mac";

        if (os.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();


        button.paint();
        checkBox.paint();


    }
}
