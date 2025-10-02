package com.hari.design_patterns.Bridge.New.Implementator;

public class Walk implements MoveLogic{
    @Override
    public void move() {
        System.out.println("MOVE LEFT LEG");
        System.out.println("MOVE RIGHT LEG");

    }
}
