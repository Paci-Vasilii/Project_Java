package com.company;

// Пометить класс как не рекомендованный к применению
@Deprecated
public class MyClass {
    private String msg;

    MyClass(String m) {
        msg = m;
    }

    // Пометить метод как не рекомендованный к применению
    @Deprecated
    String getMsg() {
        return msg;
    }
}
