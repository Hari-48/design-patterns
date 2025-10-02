package com.hari.design_patterns.Bridge.New.Abstraction;

import com.hari.design_patterns.Bridge.New.Implementator.MoveLogic;

public abstract class Animal {

    public Animal(MoveLogic moveLogic){
        this.moveLogic = moveLogic;
    }

    protected MoveLogic moveLogic;


   public abstract void moveFun();



}
