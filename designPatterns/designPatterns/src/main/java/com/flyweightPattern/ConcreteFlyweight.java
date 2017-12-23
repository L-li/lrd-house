package com.flyweightPattern;

public class ConcreteFlyweight implements Flyweight{
    private String name;
    private String writer;

    public void setName(String name) {
        this.name = name;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public void sell() {
        System.out.println("卖了一本书，书名为'"+name+"'");
    }

    @Override
    public void getOwnername(Owner owner) {
        System.out.println("卖了一本书，书名为'"+name+"'");
        System.out.println("拥有者："+owner.getOwnerName());
    }


    @Override
    public String toString() {
        return "ConcreteFlyweight{" +
                "name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
