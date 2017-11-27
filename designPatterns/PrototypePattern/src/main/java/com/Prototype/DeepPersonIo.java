package com.Prototype;

import java.io.*;

public class DeepPersonIo implements Serializable {

    private  DeepPersonSer deepPersonSer;


    /**
     * 利用io进行深克隆
     *
     * @return
     */
    public Object myClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deepPersonSer Name:").append(this.deepPersonSer.getName());
        sb.append("\n");
        sb.append("deepPersonSer Date:").append(this.deepPersonSer.getBirthday());
        return sb.toString();
    }

    public DeepPersonSer getDeepPersonSer() {
        return deepPersonSer;
    }

    public void setDeepPersonSer(DeepPersonSer deepPersonSer) {
        this.deepPersonSer = deepPersonSer;
    }
}
