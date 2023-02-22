package com.company;

public class SortDemo {
    public static void main(String[] args) {

        int array[] = new int[] {200, 400, 123, 234, 603, 537, 222, 228, 232};

        for (int i : array)
            System.out.print(i + " ");
        System.out.println();

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    int Temp;
                    Temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = Temp;
                    isSorted = false;
                }
            }
            for (int i : array)
                System.out.print(i + " ");
            System.out.println();
        }
        for (int i : array)
        System.out.print(i + " ");

    }
}
