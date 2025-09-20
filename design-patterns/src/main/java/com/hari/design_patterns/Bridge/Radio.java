package com.hari.design_patterns.Bridge;

public class Radio implements Device{
    @Override
    public void turnOn() {
        System.out.println("RADIO IS ON ");
    }

    @Override
    public void turnOff() {
        System.out.println("RADIO IS OFF");
    }

    @Override
    public void setVolumne(int num) {
        System.out.println("VOLUME IS "+num);
    }
}
