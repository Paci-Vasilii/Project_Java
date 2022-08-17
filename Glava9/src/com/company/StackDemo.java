package com.company;

    public class StackDemo {
        public static void main(String args[]) {

            // создать пустой стек на 10 элементов
            Stack stkl = new Stack(10);
            char name[] = {'T', 'o', 'm'};
            // построить стек из массива
            Stack stk2 = new Stack(name);
            char ch;
            int i;
            // поместить символы в стек stkl
            for(i=0; i < 10; i++)
                stkl.push((char) ('A' + i));
            // построить один стек из другого стека
            Stack stk3 = new Stack(stkl);
            // отобразить стеки
            System.out.print("Contents of stkl: ");
            for(i=0; i < 10; i++) {
                ch = stkl.pop();
                System.out.print(ch);
            }
            System.out.println("\n");
            System.out.print("Contents of stk2: ");
            for(i=0; i < 3; i++) {
                ch = stk2.pop();
                System.out.print(ch);
            }
            System.out.println("\n");
            System.out.print("Contents of stk3: ");
            for(i=0; i < 10; i++) {
                ch = stk3.pop();
                System.out.print(ch);
            }
        }
    }
