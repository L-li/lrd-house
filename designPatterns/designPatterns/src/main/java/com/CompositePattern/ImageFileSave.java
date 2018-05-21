package com.CompositePattern;

//图像文件类：叶子构件
class ImageFileSave extends AbstractFileSave {
    private String name;
    public ImageFileSave(String name) {
        this.name = name;
    }
    public void operation() {
        //模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}
