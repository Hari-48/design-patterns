package com.hari.design_patterns.AbstractFactory_VS_Factory.Factory;

public class MongoFactoryF  implements DBFactoryF{
    @Override
    public ConnectionF createConnection() {
        return new MongoConnectionF();
    }
}
