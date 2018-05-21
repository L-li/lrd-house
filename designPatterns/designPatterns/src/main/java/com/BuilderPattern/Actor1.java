package com.BuilderPattern;

/**
 * Created by Administrator on 2017/12/11.
 */
public class Actor1 {
    private String type; //角色类型
    private String sex; //性别
    private String face; //脸型
    private String costume; //服装
    private String hairstyle; //发型

    public String getType() {
        return (this.type);
    }

    public String getSex() {
        return (this.sex);
    }

    public String getFace() {
        return (this.face);
    }

    public String getCostume() {
        return (this.costume);
    }

    public String getHairstyle() {
        return (this.hairstyle);
    }

/*    public Actor1(String type, String sex, String face, String costume){
        this(type,sex,face,costume,null);
    }
    public Actor1(String type, String sex, String face, String costume, String hairstyle){
        this.type=type;
        this.sex=sex;
        this.face=face;
        this.costume=costume;
        this.hairstyle=hairstyle;
    }*/

    public interface IBuild {
        IBuild hairstyle(String hairstyle);
        Actor1 build();
    }
    public interface ICostume{
        IBuild costume(String costume);
    }
    public interface IFace{
        ICostume face(String face);
    }
    public interface ISex{
        IFace sex(String sex);
    }
    public static ISex type(String type) {
        return new Actor1.Builder(type);
    }
    private static class Builder implements ISex,IFace,ICostume,IBuild{
        private final Actor1 actor=new Actor1();
        public Builder(String type){
            actor.type=type;
        }
        @Override
        public IFace sex(String sex) {
            actor.sex=sex;
            return this;
        }

        @Override
        public ICostume face(String face) {
            actor.face=face;
            return this;
        }

        @Override
        public IBuild costume(String costume) {
            actor.costume=costume;
            return this;
        }

        @Override
        public IBuild hairstyle(String hairstyle) {
            actor.hairstyle=hairstyle;
            return this;
        }

        @Override
        public Actor1 build() {
            return actor;
        }
    }
}
