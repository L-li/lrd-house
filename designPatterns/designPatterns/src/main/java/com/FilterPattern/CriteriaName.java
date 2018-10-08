package com.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/9/30.
 */
public class CriteriaName implements Criteria {
    @Override
    public List<Fruit> meetCriteria(List<Fruit> allFruit) {
        List<Fruit> oranges = new ArrayList<Fruit>();
        for (Fruit fruit : allFruit) {
            if (fruit.getName().equals("橘子")) {
                oranges.add(fruit);
            }
        }
        return oranges;
    }
}
