package PrototypePattern;

import java.util.Date;

public class Person implements Cloneable {

    private String name;

    private Date birthday;

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        return person;
    }

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
