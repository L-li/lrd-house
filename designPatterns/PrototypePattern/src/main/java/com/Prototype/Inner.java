package com.Prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by LRD on 2017/11/27.
 */
public class Inner implements Serializable {

    private String name;

    private Date birthday;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
