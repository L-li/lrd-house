package com.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/9/30.
 */
public class CriteriaTaste implements Criteria {
    @Override
    public List<Fruit> meetCriteria(List<Fruit> allFruit) {
        List<Fruit> sweetFruit = new ArrayList<Fruit>();
        for (Fruit fruit : allFruit) {
            if (fruit.getTaste().equals("甜的")) {
                sweetFruit.add(fruit);
            }
        }
        return sweetFruit;
    }
}
