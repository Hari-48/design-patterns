package com.hari.design_patterns.Bridge.New.Abstraction;

import com.hari.design_patterns.Bridge.New.Implementator.MoveLogic;

public class Person extends Animal{

    public Person(MoveLogic moveLogic) {
        super(moveLogic);
    }

    @Override
    public void moveFun() {
        moveLogic.move();
    }
}

