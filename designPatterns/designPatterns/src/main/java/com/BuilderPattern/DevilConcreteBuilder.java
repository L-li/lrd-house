package com.BuilderPattern;

/**
 * Created by Administrator on 2017/12/12.
 */
public class DevilConcreteBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("恶魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("丑陋");
    }

    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }

    //覆盖钩子方法
    public boolean isBareheaded()
    {
        return true;
    }
}
