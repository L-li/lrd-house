package com.CompositePattern;

public class Client {
    public static void test() {
       /* //针对抽象构件编程
        AbstractFile file1,file2,file3,file4,folder1,folder2,folder3;
        folder1 = new Folder("资料");
        folder2 = new Folder("图片");
        folder3 = new Folder("文档");

        file1 = new ImageFile("图片1.jpg");
        file2 = new ImageFile("图片2.gif");
        file3 = new TextFile("file1.txt");
        file4 = new TextFile("file2.doc");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder1.add(folder2);
        folder1.add(folder3);

        //从“资料”节点开始进行杀毒操作
        folder1.operation();*/
    }
    /*public void test1(){
        //不能透明处理叶子构件
        ImageFile file1,file2;
        TextFile file3,file4;
        AbstractFile folder1,folder2,folder3;

        folder1 = new Folder("资料");
        folder2 = new Folder("图片");
        folder3 = new Folder("文档");

        file1 = new ImageFile("图片1.jpg");
        file2 = new ImageFile("图片2.gif");
        file3 = new TextFile("file1.txt");
        file4 = new TextFile("file2.doc");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder1.add(folder2);
        folder1.add(folder3);
    }

    public void testSave(){
        //不能透明处理容器构件
        AbstractFile file1,file2,file3,file4;
        Folder folder1,folder2,folder3;

        folder1 = new Folder("资料");
        folder2 = new Folder("图片");
        folder3 = new Folder("文档");

        file1 = new ImageFile("图片1.jpg");
        file2 = new ImageFile("图片2.gif");
        file3 = new TextFile("file1.txt");
        file4 = new TextFile("file2.doc");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder1.add(folder2);
        folder1.add(folder3);
    }*/

}
