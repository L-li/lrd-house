package com.FactoryPattern;

/**
 * Created by Administrator on 2017/11/9.
 */
public class GiftFactory {
    public static Gift createGiftA(){
        return new GiftA();
    }
    public static Gift createGiftB(){
        return new GiftB();
    }
}
