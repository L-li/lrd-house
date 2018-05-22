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
        NewEncryptFacade nef= new NewEncryptFacade();
        File directory = new File("");// 参数为空
        try {
            String courseFile = directory.getCanonicalPath();
            nef.FileEncrypt(courseFile + "/src/main/resources/facade/src.txt", courseFile + "/src/main/resources/facade/des.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
