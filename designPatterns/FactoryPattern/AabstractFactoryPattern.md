# **抽象工厂模式**
>##### 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

>##### 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

###  **产品等级结构与产品族**
---
>##### 在工厂方法模式中具体工厂负责生产具体的产品，每一个具体工厂对应一种具体产品，工厂方法具有唯一性，一般情况下，一个具体工厂中只有一个或者一组重载的工厂方法。但是有时候我们希望一个工厂可以提供多个产品对象，而不是单一的产品对象，如一个电器工厂，它可以生产电视机、电冰箱、空调等多种电器，而不是只生产某一种电器。为了更好地理解抽象工厂模式，我们先引入两个概念：

>##### (1)产品等级结构：产品等级结构即产品的继承结构，如一个抽象类是电视机，其子类有海尔电视机、海信电视机、TCL 电视机，则抽象电视机与具体品牌的电视机之间构成了一个产品等级结构，抽象电视机是父类，而具体品牌的电视机是其子类。

>##### (2)产品族：在抽象工厂模式中，产品族是指由同一个工厂生产的，位于不同产品等级结构中的一组产品，如海尔电器工厂生产的海尔电视机、海尔电冰箱，海尔电视机位于电视机产品等级结构中，海尔电冰箱位于电冰箱产品等级结构中，海尔电视机、海尔电冰箱构成了一个产品族。

###  一：**介绍**

---

>#####  意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

>##### 主要解决：主要解决接口选择的问题。

>##### 何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品

>##### 如何解决：在一个产品族里面，定义多个产品。

>##### 关键代码：在一个工厂里聚合多个同类产品。

---
##  二：**优缺点**
>##### 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。

>##### 缺点：产品族扩展非常困难。

---
###  三：**应用实例**

>#####  1、QQ 换皮肤，一整套一起换。

>##### 2、生成不同操作系统的程序。

---


###  四：**注意事项**
>##### 产品族难扩展，产品等级易扩展。

---

###  五：**具体实现**

>##### 产品类的共同接口:

```
public interface Product {
    public void CreateProduct();
}
```

>##### 产品类A：

```
public class ProductA implements Product {
    @Override
    public void CreateProduct() {
        System.out.println("ProductA");
    }
}

```
>##### 产品类B：

```
public class ProductB implements Product {
    @Override
    public void CreateProduct() {
        System.out.println("ProductB");
    }
}

```
>##### Gift接口：

```
public interface Gift {
    public void CreateGift();
}
```
>##### GiftA类:

```
public class GiftA implements Gift {
    @Override
    public void CreateGift() {
        System.out.println("GiftA");
    }
}
```

>##### GiftB类：

```
public class GiftB implements Gift {
    @Override
    public void CreateGift() {
        System.out.println("GiftB");
    }
}
```

>##### Factory接口

```
public interface Factory {
    public Product createProducts();
    public Gift createGifts();
}

```

>##### 生成ProductA和GiftA的FactoryA

```
public class FactoryA implements Factory {
    @Override
    public Product createProducts() {
        return new ProductA();
    }

    @Override
    public Gift createGifts() {
        return new GiftA();
    }

}

```
>##### 生成ProductB和GiftB的FactoryB

```
public class FactoryB implements Factory {
    @Override
    public Product createProducts() {
        return new ProductB();
    }

    @Override
    public Gift createGifts() {
        return new GiftB();
    }

}

```

>##### 测试：

```
public class Main {
    public static void main(String[] args) {
        //抽象工厂模式
        Factory factory1=new FactoryA();
        Product producta=factory1.createProducts();
        Gift gifta= factory1.createGifts();
        producta.CreateProduct();
        gifta.CreateGift();

        factory1=new FactoryB();
        Product productb=factory1.createProducts();
        Gift giftb=factory1.createGifts();
        productb.CreateProduct();
        giftb.CreateGift();


    }
}

输出：
    ProductA
    GiftA
    ProductB
    GiftB

```
