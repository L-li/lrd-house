package com.CompositePattern;

//文本文件类：叶子构件
class TextFileSave extends AbstractFileSave {
    private String name;
    public TextFileSave(String name) {
        this.name = name;
    }
    public void operation() {
        //模拟杀毒
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}
