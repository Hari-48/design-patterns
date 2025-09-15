package com.hari.design_patterns.AbstractFactory_VS_Factory;

import com.hari.design_patterns.AbstractFactory_VS_Factory.AbstractFactory.*;
import com.hari.design_patterns.AbstractFactory_VS_Factory.Factory.ConnectionF;
import com.hari.design_patterns.AbstractFactory_VS_Factory.Factory.DBFactoryF;
import com.hari.design_patterns.AbstractFactory_VS_Factory.Factory.MongoFactoryF;
import com.hari.design_patterns.AbstractFactory_VS_Factory.Factory.MySqlFactoryF;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the Design Pattern you want to perform: AbstractFactory or Factory");
        String designPattern = scanner.next();



        switch (designPattern) {
            case "Abstract Factory": {

                System.out.println("********** Abstract Factory: Creates a family → DB connection + related Query Executor (MySQL OR Oracle) ***********");

                System.out.println("""                       
                        AbstractFactory → Interface with methods for creating abstract products.
                        ConcreteFactory → Implements AbstractFactory, produces concrete products 
                        AbstractProduct → Common interface for product families.                              
                        ConcreteProduct → Specific implementations of products.                             
                        Client → Uses only AbstractFactory and AbstractProduct, never directly uses concrete classes.    
                       """);

                System.out.println("""
                                         AbstractFactory
                                   + createProductA()
                                   + createProductB()
                                        ▲       ▲
                                        |       |
                           -------------------------------
                           |                             |
                        ConcreteFactory1            ConcreteFactory2
                           | creates                       | creates
                           |                               |
                           ▼                               ▼
                        ProductA1   ProductB1         ProductA2   ProductB2
                        """);


                DBFactory dbFactory;

                System.out.println("Enter the DB");
                String dataType = scanner.next();

                if (dataType.equalsIgnoreCase("MYSQL")) {
                    dbFactory = new MySqlFactory();
                } else if (dataType.equalsIgnoreCase("MONGO")) {
                    dbFactory = new MongoFactory();
                } else {
                    dbFactory = new MongoFactory();
                }

                Connection connection = dbFactory.connect();
                QueryExecutor queryExecutor = dbFactory.execute();

                connection.connect();
                queryExecutor.execute();

            }
            case "Factory": {

                System.out.println("************* Factory Method: Creates one DB connection (MySQL OR Oracle) ***********");


                System.out.println("""
                        Product → Common interface for objects created by the factory method.
                        ConcreteProduct → Specific implementations of Product.
                        Creator (Factory) → Declares the factory method that returns Product.
                        ConcreteCreator → Implements the factory method to return ConcreteProduct
                        Client → Calls the factory method, but only depends on the Product interface, not on the concrete class.
                        """);

                System.out.println("""
                                Product
                                   ▲
                                   |
                           -----------------
                           |               |
                        ConcreteProductA  ConcreteProductB
                        
                               Creator
                               + factoryMethod()
                                   ▲
                                   |
                           -----------------
                           |               |
                        ConcreteCreatorA  ConcreteCreatorB
                        """);

                DBFactoryF dbFactoryF;
                System.out.println("Enter the DB");
                String dataType = scanner.next();
                if (dataType.equalsIgnoreCase("MYSQL")) {
                    dbFactoryF = new MySqlFactoryF();
                } else if (dataType.equalsIgnoreCase("MONGO")) {
                    dbFactoryF = new MongoFactoryF();
                } else {
                    dbFactoryF = new MongoFactoryF();
                }

                ConnectionF connectionF = dbFactoryF.createConnection();
                connectionF.connect();
            }
        }


    }

}
