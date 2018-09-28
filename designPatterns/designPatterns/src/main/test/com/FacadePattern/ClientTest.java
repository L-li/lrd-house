package com.FacadePattern;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.File;
import java.io.IOException;

public class ClientTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: main(String args[])
     */
    @Test
    public void testMain() throws Exception {
        EncryptFacade ef = new EncryptFacade();
        File directory = new File("");// 参数为空
        try {
            String courseFile = directory.getCanonicalPath();
            ef.fileEncrypt(courseFile + "/src/main/resources/facade/src.txt", courseFile + "/src/main/resources/facade/des.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method: testAbstract()
     */
    @Test
    public void testTestAbstract() throws Exception {
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
