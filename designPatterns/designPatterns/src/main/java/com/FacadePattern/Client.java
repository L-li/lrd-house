package com.FacadePattern;

import java.io.File;
import java.io.IOException;

public class Client {
    public static void main(String args[]) {
        EncryptFacade ef = new EncryptFacade();
        File directory = new File("");// 参数为空
        try {
            String courseFile = directory.getCanonicalPath();
            ef.fileEncrypt(courseFile + "/src/main/resources/facade/src.txt", courseFile + "/src/main/resources/facade/des.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void testAbstract(){
        AbstractEncryptFacade nef = (AbstractEncryptFacade) getClass(NewEncryptFacade.class);
        File directory = new File("");// 参数为空
        try {
            String courseFile = directory.getCanonicalPath();
            nef.FileEncrypt(courseFile + "/src/main/resources/facade/src.txt", courseFile + "/src/main/resources/facade/des.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static Object getClass(Class<?extends AbstractEncryptFacade> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
