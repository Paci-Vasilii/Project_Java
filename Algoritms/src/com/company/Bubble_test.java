package com.company;

public class Bubble_test {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36, 0};

            for(int step = 0; step < array.length; step++) {
                int index = min(array, step);

                int temp = array[step];
                array[step] = array[index];
                array[index] = temp;

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

    }



    private static int min(int[] array, int start) {

        int minValue = array[start];
        int minIndex = start;

        for (int i = start; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
