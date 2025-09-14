package com.hari.design_patterns.State;

public class RedSignal implements SignalMode{
    @Override
    public void action() {
        System.out.println("Please Stop the car");
    }
}
