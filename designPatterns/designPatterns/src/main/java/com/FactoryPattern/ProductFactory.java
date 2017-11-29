package com.FactoryPattern;

/**
 * Created by Administrator on 2017/11/9.
 */
public class ProductFactory {
    public  Product createProductA(){
        return new ProductA();
    }
    public  Product createProductB(){
        return new ProductB();
    }
}
