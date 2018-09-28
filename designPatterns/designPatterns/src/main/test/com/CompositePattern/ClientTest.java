package com.CompositePattern;

import com.CompositePattern.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClientTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void testMain() throws Exception {
    //针对抽象构件编程
    AbstractFile file1,file2,file3,file4,folder1,folder2,folder3;
    folder1 = new Folder("资料");
    folder2 = new Folder("图片");
    folder3 = new Folder("文档");

    file1 = new ImageFile("图片1.jpg");
    file2 = new ImageFile("图片2.gif");
    file3 = new TextFile("测试文档.txt");
    file4 = new TextFile("需求文档.doc");

    folder2.add(file1);
    folder2.add(file2);
    folder3.add(file3);
    folder3.add(file4);
    folder1.add(folder2);
    folder1.add(folder3);

    //从“资料”节点开始进行杀毒操作
    folder1.operation();
}
    @Test
    public void testFolder3() throws Exception {
        //针对抽象构件编程
        AbstractFile file1,file2,file3,file4,folder1,folder2,folder3;
        folder3 = new Folder("文档");

        file3 = new TextFile("测试文档.txt");
        file4 = new TextFile("需求文档.doc");

        folder3.add(file3);
        folder3.add(file4);

        //从“文档”节点开始进行杀毒操作
        folder3.operation();
    }

    @Test
public void testLeaf() throws Exception {
   //不能透明处理叶子构件
    ImageFile file1,file2;
    TextFile file3,file4;
    AbstractFile folder1,folder2,folder3;

    folder1 = new Folder("资料");
    folder2 = new Folder("图片");
    folder3 = new Folder("文档");

    file1 = new ImageFile("图片1.jpg");
    file2 = new ImageFile("图片2.gif");
    file3 = new TextFile("测试文档.txt");
    file4 = new TextFile("需求文档.doc");

    folder2.add(file1);
    folder2.add(file2);
    folder3.add(file3);
    folder3.add(file4);
    folder1.add(folder2);
    folder1.add(folder3);

    //从“资料”节点开始进行杀毒操作
    folder1.operation();
} 


@Test
public void testTestSave() throws Exception {
    //不能透明处理容器构件
    AbstractFileSave file1,file2,file3,file4;
    FolderSave folder1,folder2,folder3;

    folder1 = new FolderSave("资料");
    folder2 = new FolderSave("图片");
    folder3 = new FolderSave("文档");

    file1 = new ImageFileSave("图片1.jpg");
    file2 = new ImageFileSave("图片2.gif");
    file3 = new TextFileSave("测试文档.txt");
    file4 = new TextFileSave("需求文档.doc");

    folder2.add(file1);
    folder2.add(file2);
    folder3.add(file3);
    folder3.add(file4);
    folder1.add(folder2);
    folder1.add(folder3);

    //从“资料”节点开始进行杀毒操作
    folder1.operation();
} 


} 
