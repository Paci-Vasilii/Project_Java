package com.company;

public class Encode {
    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88888888;
        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        //зашивровать сообщение
        for(int i = 0; i < msg.length(); i++)
            //постороение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Зашиврованное сообщение: ");
        System.out.println(encmsg);

        //Дешифровать сообщение
        for (int i = 0; i <msg.length(); i++)
            //построение дешифрованной строки сообщения
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
