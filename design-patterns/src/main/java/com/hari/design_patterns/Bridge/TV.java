package com.hari.design_patterns.Bridge;

public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void setVolumne(int num) {
        System.out.println("TV Volume is "+num);
    }
}
