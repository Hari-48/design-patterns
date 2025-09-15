package com.hari.design_patterns.AbstractFactory_VS_Factory.AbstractFactory;


public class MongoFactory implements DBFactory{
    @Override
    public Connection connect() {
        return new MongoConnection();
    }

    @Override
    public QueryExecutor execute() {
        return new MongoExecute();
    }
}
