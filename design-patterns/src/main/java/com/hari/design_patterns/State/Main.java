package com.hari.design_patterns.State;

public class Main {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

//        trafficLight.handleRequest();

        trafficLight.setSignalMode(new RedSignal());
        trafficLight.handleRequest();

        trafficLight.setSignalMode(new YellowSignal());
        trafficLight.handleRequest();

        trafficLight.setSignalMode(new RedSignal());
        trafficLight.handleRequest();

    }
}
