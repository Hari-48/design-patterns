package com.hari.design_patterns.AbstractFactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Render Mac Button");
    }
}
