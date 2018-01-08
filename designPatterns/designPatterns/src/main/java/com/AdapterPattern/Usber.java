package com.AdapterPattern;

/**
 * Created by LRD
 * usb接口实现实体类
 */

public class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("USB接口");
    }
}
