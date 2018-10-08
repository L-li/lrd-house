package com.FilterPattern;

/**
 * Created by user on 2018/9/30.
 */

public class Fruit {
    private String name;
    private String taste;//味道
    private String shape;//形状

    Fruit(String name, String taste, String shape) {
        this.name = name;
        this.taste = taste;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }


}
