package com.PrototypePattern;


import java.util.Date;

public class Client {
    public static void main(String[] args) throws Exception {
        /**
         * 查看object类的clone方法
         */

        /**
         * 浅克隆
         */
        Date date = new Date(1234455667);
//        Person person1 = new Person();
//        person1.setName("李四");
//        person1.setBirthday(date);
//        Person person2 = person1.clone();
////        person1.setName("张三");  // 改变person1的名字
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        date.setTime(222222222);
//        person1.setBirthday(date);//改变person1的生日
//        System.out.println(person1.getBirthday());
//        System.out.println(person2.getBirthday());

        /**
         * 深克隆(克隆自身)
         */
//        DeepPerson deepPerson = new DeepPerson();
//        deepPerson.setBirthday(date);
//        DeepPerson deepPerson1 = deepPerson.clone();
//        date.setTime(1233422342);
//        deepPerson.setBirthday(date);
//        System.out.println(deepPerson.getBirthday());
//        System.out.println(deepPerson1.getBirthday());


    
        DeepPersonSer deepPersonSer = new DeepPersonSer();
        deepPersonSer.setName("可序列化");
        deepPersonSer.setBirthday(date);
        DeepPersonIo deepPersonIo = new DeepPersonIo();
        deepPersonIo.setDeepPersonSer(deepPersonSer);
        System.out.println("克隆前对象: " + deepPersonIo.toString());
        //克隆
        DeepPersonIo deepPersonIo1 = (DeepPersonIo) deepPersonIo.myClone();
        deepPersonSer.setBirthday(new Date(222222222));
//        deepPersonIo1.getDeepPersonSer().setName("可序列化后");
        System.out.println("克隆后新对象: " + deepPersonIo1.toString());
        System.out.println("克隆前的对象: " + deepPersonIo.toString());
    }
}
