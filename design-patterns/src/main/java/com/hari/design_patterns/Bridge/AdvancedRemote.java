package com.hari.design_patterns.Bridge;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    void powerOn() {
        device.turnOn();

    }

    @Override
    void powerOff() {

        device.turnOff();
    }

    @Override
    void volumneUp() {
        device.setVolumne(90);
    }
}
