package com.CompositePattern;

import java.util.ArrayList;

//文件夹类：容器构件
class FolderSave extends AbstractFileSave {
    //定义集合fileList，用于存储AbstractFile类型的成员
    private ArrayList<AbstractFileSave> fileList=new ArrayList<AbstractFileSave>();
    private String name;

    public FolderSave(String name) {
        this.name = name;
    }

    public void add(AbstractFileSave file) {
        fileList.add(file);
    }

    public void remove(AbstractFileSave file) {
        fileList.remove(file);
    }

    public AbstractFileSave getChild(int i) {
        return (AbstractFileSave)fileList.get(i);
    }

    public void operation() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒

        //递归调用成员构件的killVirus()方法
        for(Object obj : fileList) {
            ((AbstractFileSave)obj).operation();
        }
    }
}
