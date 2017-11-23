package com.Prototype;

import java.util.Hashtable;

/**
 * 原型管理器
 */
public class PersonManager {
    //定义一个Hashtable，用于存储原型对象
    private Hashtable ht = new Hashtable();
    private static PersonManager pm = new PersonManager();


    private PersonManager() {
        ht.put("per", new Person());
        ht.put("deepPer", new DeepPerson());
    }


}
