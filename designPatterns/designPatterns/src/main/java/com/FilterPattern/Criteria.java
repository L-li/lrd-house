package com.FilterPattern;

import java.util.List;

/**
 * Created by user on 2018/9/30.
 */
public interface Criteria {
    List<Fruit> meetCriteria(List<Fruit> allFruit);
}
