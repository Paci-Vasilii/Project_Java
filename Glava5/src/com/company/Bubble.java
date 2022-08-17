package com.company;

public class Bubble {
    public static void main (String args[]) {
        char nums[] = { 'a', 'b', 'n', 'z', 'q',
                       'u', 's', 'v', 'm', 'n' };
        int a, b;
        int size;
        char t;

        size = 10; //количество сортируемых элементов

        //отобразить исходный мвссив
        System.out.print("Исходный массив:");
        for(int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        //реализовать алгоритм пузырьковой сортировки
        for (a = 1; a < size; a++)
            for(b=size-1; b >= a; b--) {
                if (nums[b-1] > nums[b]) {     // если требуемый порядок
                                                 // следования не соблюдается,
                                                 // поменять элементы местами
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        // отобразить отсортированный массив
        System.out.print("Отсортированный массив:");
        for(int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
