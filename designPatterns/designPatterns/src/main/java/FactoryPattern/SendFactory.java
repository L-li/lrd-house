package FactoryPattern;

/**
 * Created by Administrator on 2017/11/7.
 */
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

    //多个工厂方法模式
    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }

    //静态工厂模式
    public static Sender staticProduceMail(){
        return new MailSender();
    }
    public static Sender staticProduceSms(){
        return new SmsSender();
    }
    public static Product sdsd(){
        return new ProductB();
    }
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
