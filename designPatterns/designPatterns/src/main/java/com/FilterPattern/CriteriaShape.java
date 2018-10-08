package com.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/9/30.
 */
public class CriteriaShape implements Criteria {
    @Override
    public List<Fruit> meetCriteria(List<Fruit> allFruit) {
        List<Fruit> circleFruit = new ArrayList<Fruit>();
        for (Fruit fruit : allFruit) {
            if (fruit.getShape().equals("圆形")) {
                circleFruit.add(fruit);
            }
        }
        return circleFruit;
    }
}
