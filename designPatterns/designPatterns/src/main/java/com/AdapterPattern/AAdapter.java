package com.AdapterPattern;

/**
 * Created by LRD
 */
public class AAdapter extends AImp {
    @Override
    public void a() {
        System.out.println("实现a方法被调用");
    }

    @Override
    public void c() {
        System.out.println("实现c方法被调用");
    }
}
