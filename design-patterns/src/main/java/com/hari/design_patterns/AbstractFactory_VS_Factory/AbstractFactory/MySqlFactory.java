package com.hari.design_patterns.AbstractFactory_VS_Factory.AbstractFactory;

import java.util.concurrent.Executor;

public class MySqlFactory implements DBFactory{
    @Override
    public Connection connect() {
        return new MySqlConnection();
    }

    @Override
    public QueryExecutor execute() {
        return new MysqlExecute();
    }
}
