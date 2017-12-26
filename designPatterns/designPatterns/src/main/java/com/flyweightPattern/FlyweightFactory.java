package com.flyweightPattern;

import java.util.Hashtable;

/**
 * 生成基于给定信息的实体类的对象
 */
public class FlyweightFactory {
    private static final Hashtable flyweights = new Hashtable();

    public ConcreteFlyweight getFlyweight(String name, String writer) {
        if(flyweights.get(name)==null){
            synchronized (flyweights){
                ConcreteFlyweight concreteFlyweight = (ConcreteFlyweight) flyweights.get(name);
                if (concreteFlyweight == null) {
                    concreteFlyweight = new ConcreteFlyweight();
                    concreteFlyweight.setName(name);
                    concreteFlyweight.setWriter(writer);
                    flyweights.put(name, concreteFlyweight);
                }
            }
        }
        return (ConcreteFlyweight) flyweights.get(name);
    }

    public int getFlyweightSize() {
        return flyweights.size();
    }
}
