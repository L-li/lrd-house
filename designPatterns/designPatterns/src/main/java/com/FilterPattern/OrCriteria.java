package com.FilterPattern;

import java.util.List;

/**
 * Created by user on 2018/9/30.
 * 多重过滤器(OR)
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Fruit> meetCriteria(List<Fruit> allFruit) {
        List<Fruit> firstCriteriaItems = criteria.meetCriteria(allFruit);        //第一重过滤放置一个新容器内
        List<Fruit> otherCriteriaItems = otherCriteria.meetCriteria(allFruit);   //仍是第一重过滤放置一个新容器内
        for (Fruit fruit : otherCriteriaItems) {                                    //对第二个新容器遍历
            if (!firstCriteriaItems.contains(fruit)) {                            //对比第一个容器内的对象
                firstCriteriaItems.add(fruit);
            }
        }
        return firstCriteriaItems;
    }
}
