package com.hari.design_patterns.Bridge;

abstract class RemoteControl {


    public RemoteControl(Device device) {
        this.device = device;
    }

    protected Device device ;


    abstract void  powerOn();
    abstract void powerOff();
    abstract void volumneUp();






}
