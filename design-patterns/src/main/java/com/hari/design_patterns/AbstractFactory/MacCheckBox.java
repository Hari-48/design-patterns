package com.hari.design_patterns.AbstractFactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Render Mac Checkbox");
    }
}
