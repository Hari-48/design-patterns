package com.hari.design_patterns.State;

import java.util.SortedMap;

public class GreenSignal implements  SignalMode{
    @Override
    public void action() {
        System.out.println("Lets Go..");
    }
}
