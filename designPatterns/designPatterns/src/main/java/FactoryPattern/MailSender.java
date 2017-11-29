package FactoryPattern;

/**
 * Created by Administrator on 2017/11/7.
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
