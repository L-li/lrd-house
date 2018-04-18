package com.flyweightPattern;

/**
 * 使用工厂
 */
public class FlyweightPatternDemo {
    FlyweightFactory factory = new FlyweightFactory();
    Flyweight fly1;
    Flyweight fly2;
    Flyweight fly3;
    Flyweight fly4;

    public FlyweightPatternDemo() {
        fly1 = factory.getFlyweight("编程思想","1");
        fly2 = factory.getFlyweight("jvm","2");
        fly3 = factory.getFlyweight("编程思想","1");
        fly4 = factory.getFlyweight("编程思想","1");
    }

  /*  public void showFlyweight() {
        fly1.sell();
        fly2.sell();
        fly3.sell();
        fly4.sell();
        int objSize = factory.getFlyweightSize();
        System.out.println("创建对象的数量-->" + objSize);
        System.out.println(fly1.toString());
        System.out.println(fly2.toString());
        System.out.println(fly3.toString());
        System.out.println(fly4.toString());
        System.out.println();
    }*/

    public void showFlyweight() {
        fly1.getOwnername(new Owner("小明"));
        fly2.getOwnername(new Owner("小丽"));
        fly3.getOwnername(new Owner("小张"));
        fly4.getOwnername(new Owner("小王"));
        int objSize = factory.getFlyweightSize();
        System.out.println("创建对象的数量-->" + objSize);
    }

    public static void main(String[] args) {
        FlyweightPatternDemo flyweightPattern = new FlyweightPatternDemo();
        flyweightPattern.showFlyweight();

    }
}
