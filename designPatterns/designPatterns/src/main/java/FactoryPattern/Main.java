package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        //普通工厂模式
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();

        //多个工厂方法模式
       // SendFactory factory1 = new SendFactory();
        Sender sender1 = factory.produceMail();
        sender1.Send();

        //静态工厂模式
        Sender sender2 = factory.staticProduceMail();
        sender2.Send();

        //反射机制
        Sender sender3 = (SmsSender) SendFactory.getClass(SmsSender.class);
        sender3.Send();

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
