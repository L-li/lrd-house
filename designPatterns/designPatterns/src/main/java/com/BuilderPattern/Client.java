package com.BuilderPattern;

/**
 * Created by Administrator on 2017/12/12.
 */
public class Client {
    public static void main(String[] args) {
        ActorDirector  ad=new ActorDirector();
        AngelConcreteBuilder angel=new AngelConcreteBuilder();
        Actor  actor=ad.construct(angel);

        //Actor actor=ActorBuilder.construct(angel);

        /*DevilConcreteBuilder devil= new DevilConcreteBuilder();
        Actor  actor=ad.construct1(devil);*/

        Actor1 actor1=Actor1.type("天使").sex("女").face("漂亮").costume("白裙").hairstyle("披肩长发").build();

        String  type = actor.getType();

        System.out.println(type  + "的外观：");

        System.out.println("性别：" + actor.getSex());

        System.out.println("面容：" + actor.getFace());

        System.out.println("服装：" + actor.getCostume());

        System.out.println("发型：" + actor.getHairstyle());
    }
}
