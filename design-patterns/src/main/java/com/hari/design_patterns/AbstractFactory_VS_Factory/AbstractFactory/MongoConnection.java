package com.hari.design_patterns.AbstractFactory_VS_Factory.AbstractFactory;

public class MongoConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("MONGO-CONNECTION");
    }
}
