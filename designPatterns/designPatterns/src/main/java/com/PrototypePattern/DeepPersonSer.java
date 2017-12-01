package com.PrototypePattern;

import java.io.Serializable;
import java.util.Date;

public class DeepPersonSer implements Serializable {


    private static final long serialVersionUID = -5701821700994799226L;
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
