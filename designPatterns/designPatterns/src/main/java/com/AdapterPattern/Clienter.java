package com.AdapterPattern;

/**
 * Created by LRD
 */
public class Clienter {
    public static void main(String[] args) {
        //类适配器模式
        Ps2 p = new Adapter();
        p.isPs2();
        //对象适配器模式
        Ps2 p1 = new AdapterTarget(new Usber());
        p1.isPs2();
        //接口适配器模式
        A a = new Aer();
        a.a();
        a.c();
    }
}
