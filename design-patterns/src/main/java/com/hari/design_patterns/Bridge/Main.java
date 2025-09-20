package com.hari.design_patterns.Bridge;

public class Main {

    public static void main(String[] args) {
        RemoteControl radio =  new SimpleRemote(new Radio());
        radio.powerOn();
        radio.volumneUp();
        radio.powerOff();

        System.out.println("---------------");

        RemoteControl tv =  new SimpleRemote(new TV());
        tv.powerOff();
        tv.powerOn();
        tv.volumneUp();
    }
}
