package com.flyweightPattern;

public class ConcreteFlyweight extends Flyweight {
    private String name;
    private String writer;


    public ConcreteFlyweight(String new_name){
        name =new_name;
    }
    @Override
    public void sell() {
        System.out.println("卖了一本书，书名为'"+name+"'");
    }


    @Override
    public String toString() {
        return "ConcreteFlyweight{" +
                "name='" + name + '\'' +
                ", age='" + writer + '\'' +
                '}';
    }
}
