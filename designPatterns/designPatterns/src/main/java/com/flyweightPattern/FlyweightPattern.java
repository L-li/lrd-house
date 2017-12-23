package com.flyweightPattern;

public class FlyweightPattern {
    FlyweightFactory factory = new FlyweightFactory();
    Flyweight fly1;
    Flyweight fly2;
    Flyweight fly3;
    Flyweight fly4;

    public FlyweightPattern() {
        fly1 = factory.getFlyweight("编程思想");
        fly2 = factory.getFlyweight("jvm");
        fly3 = factory.getFlyweight("编程思想");
        fly4 = factory.getFlyweight("编程思想");
    }

    public void showFlyweight() {
        fly1.sell();
        fly2.sell();
        fly3.sell();
        fly4.sell();
        int objSize = factory.getFlyweightSize();
        System.out.println("创建对象的数量-->" + objSize);
        System.out.println(fly1.toString());
    }

    public static void main(String[] args) {
        FlyweightPattern flyweightPattern = new FlyweightPattern();
        flyweightPattern.showFlyweight();
    }
}
