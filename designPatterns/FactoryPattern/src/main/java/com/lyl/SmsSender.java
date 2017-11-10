package com.lyl;

/**
 * Created by Administrator on 2017/11/7.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
