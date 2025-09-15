package com.hari.design_patterns.AbstractFactory_VS_Factory.Factory;

public class MongoConnectionF implements ConnectionF{
    @Override
    public void connect() {
        System.out.println("MongoConnection");
    }
}
