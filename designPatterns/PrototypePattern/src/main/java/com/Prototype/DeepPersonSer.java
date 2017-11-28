package com.Prototype;

import java.io.Serializable;
import java.util.Date;

public class DeepPersonSer implements Serializable {

    private static final long serialVersionUID = -323919189005560804L;
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
