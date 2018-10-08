package com.FilterPattern;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 2018/9/30.
 */
public class FilterPatternDemoTest {

    @Test
    public void main() throws Exception {
        List<Fruit> allFruit = new ArrayList<Fruit>();

        allFruit.add(new Fruit("苹果", "甜的 ", "圆形"));
        allFruit.add(new Fruit("橘子", "酸的", "圆形"));
        allFruit.add(new Fruit("菠萝", "甜的", "椭圆"));
        allFruit.add(new Fruit("西瓜", "甜的", "椭圆"));
        allFruit.add(new Fruit("枣子", "酸的", "圆形"));

        Criteria circle = new CriteriaShape();
        Criteria sweet = new CriteriaTaste();
        Criteria orange = new CriteriaName();
        Criteria sweetOrange = new AndCriteria(sweet, orange);      //构造器的作用，传参设置内部变量！！
        Criteria circleOrSweet = new OrCriteria(circle, sweet);

        System.out.println("橘子: ");
        printFruit((orange.meetCriteria(allFruit)));

        System.out.println("\n甜的: ");
        printFruit((sweet.meetCriteria(allFruit)));

        System.out.println("\n圆形: ");
        printFruit((circle.meetCriteria(allFruit)));

        System.out.println("\n甜的橘子: ");
        printFruit((sweetOrange.meetCriteria(allFruit)));

        System.out.println("\n圆的或甜的：");
        printFruit(circleOrSweet.meetCriteria(allFruit));
    }

    public void printFruit(List<Fruit> allFruit) throws Exception {
        for (Fruit fruit : allFruit) {
            System.out.println("Fruit:[ Name :" + fruit.getName() + ",Taste: " + fruit.getTaste() + ",Shape:" + fruit.getShape() + "]");
        }
    }

}