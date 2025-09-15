package com.hari.design_patterns.AbstractFactory;

//concreteProduct - 1
public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Render Windows Button");
    }
}
