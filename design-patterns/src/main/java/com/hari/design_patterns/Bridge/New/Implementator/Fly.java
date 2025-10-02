package com.hari.design_patterns.Bridge.New.Implementator;

public class Fly implements MoveLogic{
    @Override
    public void move() {
        System.out.println("MOVE THE TAIL");
    }
}
