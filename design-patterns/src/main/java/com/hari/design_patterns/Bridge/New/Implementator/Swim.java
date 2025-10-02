package com.hari.design_patterns.Bridge.New.Implementator;

public class Swim implements MoveLogic{
    @Override
    public void move() {
        System.out.println("FLAP WINGS");
    }
}
