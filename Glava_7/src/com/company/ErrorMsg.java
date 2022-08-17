package com.company;

public class ErrorMsg {
    // коды ошибок
    // Константы обьявляются с помощью ключевого слова final
    final int OUNTER = 0;
    final int INNER = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    //Возвратить сообщение об ошибке
    String getErrorMsg(int i) {
        if(i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}
