package com.hari.design_patterns.AbstractFactory_VS_Factory.AbstractFactory;

public class MongoExecute implements QueryExecutor{
    @Override
    public void execute() {
        System.out.println("MONGO-EXECUTE");
    }
}
