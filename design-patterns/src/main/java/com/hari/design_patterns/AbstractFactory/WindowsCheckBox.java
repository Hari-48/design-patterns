package com.hari.design_patterns.AbstractFactory;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Render Windows Checkbox");
    }
}
