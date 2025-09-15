package com.hari.design_patterns.AbstractFactory_VS_Factory.AbstractFactory;

import java.util.concurrent.Executor;

public class MysqlExecute implements QueryExecutor {
    @Override
    public void execute() {
        System.out.println("MYSQL-EXECUTOR");
    }
}
