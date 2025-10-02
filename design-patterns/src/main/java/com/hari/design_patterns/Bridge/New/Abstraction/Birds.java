package com.hari.design_patterns.Bridge.New.Abstraction;

import com.hari.design_patterns.Bridge.New.Implementator.MoveLogic;

public class Birds extends Animal {
    public Birds(MoveLogic moveLogic) {
        super(moveLogic);
    }

    @Override
    public void moveFun() {
        moveLogic.move();
    }
}
