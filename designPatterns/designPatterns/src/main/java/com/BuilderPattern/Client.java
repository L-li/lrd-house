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

        String  type = actor.getType();

        System.out.println(type  + "的外观：");

        System.out.println("性别：" + actor.getSex());

        System.out.println("面容：" + actor.getFace());

        System.out.println("服装：" + actor.getCostume());

        System.out.println("发型：" + actor.getHairstyle());
    }
}
