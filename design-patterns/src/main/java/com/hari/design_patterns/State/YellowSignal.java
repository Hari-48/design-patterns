package com.hari.design_patterns.State;

import java.sql.SQLOutput;

public class YellowSignal implements SignalMode{
    @Override
    public void action() {
        System.out.println("Get Ready");
    }
}
