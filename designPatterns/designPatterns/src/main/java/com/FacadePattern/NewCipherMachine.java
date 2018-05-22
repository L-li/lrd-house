package com.FacadePattern;

public class NewCipherMachine {
    public String encrypt(String plainText) {
        System.out.print("数据加密，将明文转换为密文：");
        String es = "";
        int key = 10;//设置密钥，移位数为10
        char[] chars = plainText.toCharArray();
        for(char ch :chars){
            int temp = Integer.valueOf(ch);
            //小写字母移位
            if (ch >= 'a' && ch <= 'z') {
                temp += key % 26;
                if (temp > 122) temp -= 26;
                if (temp < 97) temp += 26;
            }
            //大写字母移位
            if (ch >= 'A' && ch <= 'Z') {
                temp += key % 26;
                if (temp > 90) temp -= 26;
                if (temp < 65) temp += 26;
            }
            es += ((char)temp);
        }
        System.out.println(es);
        return es;
    }
}
