package com.hari.design_patterns.State;

public class TrafficLight {

    private SignalMode signalMode;

    public TrafficLight() {

    }

    public void setSignalMode(SignalMode signalMode) {
        this.signalMode = signalMode;
    }


    public void handleRequest(){
        signalMode.action();
    }


}
