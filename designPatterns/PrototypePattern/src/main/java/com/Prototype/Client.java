package com.Prototype;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws Exception {
        /**
         * 浅克隆
         */
        Date date = new Date(1234455667);
        Person person1 = new Person();
        person1.setName("李四");
        person1.setBirthday(date);
        Person person2 = person1.clone();
//        person1.setName("张三");  // 改变person1的属性
        System.out.println(person1);
        System.out.println(person2);
//        System.out.println(person1.getName());
//        System.out.println(person1.getBirthday());
        System.out.println(person2.getName());
//        date.setTime(222222222);
//        person1.setBirthday(date);
//
//        System.out.println(person1.getBirthday());
//        System.out.println(person2.getBirthday());

        /**
         * 深克隆
         */
//        DeepPerson deepPerson = new DeepPerson();
//        deepPerson.setBirthday(date);
//        DeepPerson deepPerson1 = deepPerson.clone();
//        date.setTime(1233422342);
//        deepPerson.setBirthday(date);
//        System.out.println(deepPerson.getBirthday());
//        System.out.println(deepPerson1.getBirthday());

    }
}
