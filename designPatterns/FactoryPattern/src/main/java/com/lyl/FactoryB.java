package com.lyl;

/**
 * Created by Administrator on 2017/11/9.
 */
public class FactoryB implements Factory {
    @Override
    public Product createProducts() {
        return new ProductB();
    }

    @Override
    public Gift createGifts() {
        return new GiftB();
    }

}
