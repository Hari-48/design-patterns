package com.hari.design_patterns.AbstractFactory_VS_Factory.AbstractFactory;

public class MySqlConnection implements  Connection{
    @Override
    public void connect() {
        System.out.println("MYSQL-CONNECTION");
    }

}
