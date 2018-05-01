package com.AdapterPattern;

/**
 * Created by LRD
 */
public class Clienter {
    /**
     * 类适配器模式
     */
    public static void adapterClass() {
        Ps2 p = new Adapter();
        p.isPs2();
    }

    /**
     * 对象适配器模式
     */
    public static void adapterTarget() {
        Ps2 p1 = new AdapterTarget(new Usber());
        p1.isPs2();

    }

    /**
     * 接口适配器模式
     */
    public static void adapterInterface() {
        A a = new AAdapter();
        a.a();
        a.c();
    }
}
