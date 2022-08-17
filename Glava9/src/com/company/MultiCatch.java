package com.company;

public class MultiCatch {
    public static void main(String args[]) {
        int a = 88, b = 0;
        int result;
        char chrs[] = { 'A', 'B', 'C' };

        for(int i=0; i < 2; i++) {
            try {
                if(i == 0)
                    //Сгенерировать исключение ArithmeticException
                    result = a / b;
                else
                    // сгенерировать исключение ArrayIndexOutOfBoundsException
                chrs[5] = 'X';
            }
            // в этом операторе catch организуется перехват обоих исключений
            catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
                System.out.println("Перехваченное исключение: " + e);
            }
        }
        System.out.println("После группового перехватчика исключений");
    }
}
