package com.FilterPattern;

import java.util.List;

/**
 * Created by user on 2018/9/30.
 * 多重过滤器(AND)
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Fruit> meetCriteria(List<Fruit> allFruit) {
        List<Fruit> firstCriteriaFruit = criteria.meetCriteria(allFruit);    //生成新的容器放置第一重过滤
        return otherCriteria.meetCriteria(firstCriteriaFruit);              //第二重过滤
    }
}
