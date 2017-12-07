# **工厂模式**
>#####  工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

>##### 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。

###  一：**介绍**

---

>##### 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

>##### 主要解决：主要解决接口选择的问题。

>##### 何时使用：我们明确地计划不同条件下创建不同实例时。

>##### 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。

>##### 关键代码：创建过程在其子类执行。

---

###  二：**应用实例**

>#####  1、您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现。

>##### 2、Hibernate 换数据库只需换方言和驱动就可以。

---

###  三：**优缺点**
>##### 优点：
>#### 1、一个调用者想创建一个对象，只要知道其名称就可以了。

>####  2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。

>####  3、屏蔽产品的具体实现，调用者只关心产品的接口。
>##### 缺点：
>####  1、每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。

---
###  四：**使用场景**

>#### 1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。

>#### 2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。

>#### 3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。

---


###  五：**注意事项**
>#### 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。

---

###  六：**具体实现**

>#### 1、普通工厂模式：建立一个工厂类，对实现了同一接口的一些类进行实例的创建。

>#### 首先，创建一个接口:

```
public interface Sender {
    public void Send();
}
```

>#### 其次，创建实现类：

```
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}

```


```
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}

```
>#### 最后，建工厂类：

```
public class SendFactory {
    //普通工厂模式
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
```
>#### 测试:

```
public class Main {
    public static void main(String[] args) {
        //普通工厂模式
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}

输出：this is sms sender!
```

>#### 2、多个工厂方法模式：是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。

>#### 将上面的代码做下修改，改动下SendFactory类就行，如下：

```
public class SendFactory {
    //多个工厂方法模式
    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }
}
```

>#### 测试

```
public class Main {
    public static void main(String[] args) {
        //多个工厂方法模式
        SendFactory factory1 = new SendFactory();
        Sender sender1 = factory.produceMail();
        sender1.Send();
    }
}

输出：this is mailsender!

```

>#### 3、静态工厂方法模:将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。

```
public class SendFactory {
    //静态工厂模式
    public static Sender staticProduceMail(){
        return new MailSender();
    }
    public static Sender staticProduceSms(){
        return new SmsSender();
    }
}

```
>#### 测试

```
public class Main {
    public static void main(String[] args) {
        //静态工厂模式
        Sender sender2 = SendFactory.staticProduceMail();
        sender2.Send();
    }
}

输出：this is mailsender!

```

>#### 4、反射机制:使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点

```
public class SendFactory {
    //反射机制
    public static Object getClass(Class<?extends Sender> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }
}

```
>#### 测试

```
public class Main {
    public static void main(String[] args) {
        //反射机制
        Sender sender3 = (SmsSender) SendFactory.getClass(SmsSender.class);
        sender3.Send();
    }
}

输出：this is mailsender!

```
>#### 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码