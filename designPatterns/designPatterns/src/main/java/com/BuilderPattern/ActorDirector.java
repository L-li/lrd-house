package com.BuilderPattern;

/**
 * Created by Administrator on 2017/12/12.
 */
public class ActorDirector {
    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab)
    {
        Actor actor;

        ab.buildType();

        ab.buildSex();

        ab.buildFace();

        ab.buildCostume();

        ab.buildHairstyle();

        actor=ab.createActor();

        return actor;
    }
    public  Actor construct1(ActorBuilder ab)
    {
        Actor  actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        //通过钩子方法来控制产品的构建
        if(!ab.isBareheaded())
        {
            ab. buildHairstyle();
        }
        actor=ab.createActor();
        return  actor;
    }
}
