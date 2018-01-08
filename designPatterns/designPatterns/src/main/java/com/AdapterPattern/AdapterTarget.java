package com.AdapterPattern;

/**
 * Created by LRD
 * 适配器 Adapter
 */
public class AdapterTarget implements Ps2 {
    private Usb usb;

    public AdapterTarget(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
