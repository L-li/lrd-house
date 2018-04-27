package com.AdapterPattern;

/**
 * Created by LRD
 * 适配器 Adapter
 */
public class Adapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }

}
