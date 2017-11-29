package PrototypePattern;

import java.util.Date;

public class DeepPerson implements Cloneable {

    private String name;

    private Date birthday;


    @Override
    protected DeepPerson clone() throws CloneNotSupportedException {
        DeepPerson person = (DeepPerson) super.clone();
        person.birthday = (Date) this.birthday.clone();
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
