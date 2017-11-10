package com.lyl;

/**
 * Created by Administrator on 2017/11/9.
 */
public class FactoryA implements Factory {
    @Override
    public Product createProducts() {
        return new ProductA();
    }

    @Override
    public Gift createGifts() {
        return new GiftA();
    }

}
