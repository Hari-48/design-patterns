package com.hari.design_patterns.Bridge;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.hari.design_patterns.Bridge.New.Abstraction.Animal;
import com.hari.design_patterns.Bridge.New.Abstraction.Fish;
import com.hari.design_patterns.Bridge.New.Abstraction.Person;
import com.hari.design_patterns.Bridge.New.Implementator.Swim;
import com.hari.design_patterns.Bridge.New.Implementator.Walk;

public class Main {

    public static void main(String[] args) {
        RemoteControl radio =  new SimpleRemote(new Radio());
//        radio.powerOn();
//        radio.volumneUp();
//        radio.powerOff();
//
//        System.out.println("---------------");
//
//        RemoteControl tv =  new SimpleRemote(new TV());
//        tv.powerOff();
//        tv.powerOn();
//        tv.volumneUp();


        Animal person = new Person(new Walk());
        person.moveFun();



//        Animal fish =  new Fish(new Swim());
//







    }
}
