package com.hari.design_patterns.AbstractFactory_VS_Factory.Factory;

public class MySqlFactoryF implements  DBFactoryF{
    @Override
    public ConnectionF createConnection() {
        return new MysqlConnectionF();
    }
}
