package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        int m ;
        n = in.nextInt();
        m = in.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Input matrix row " + i + " element no: " + j + " : ");
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("======= matrix =======");
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + "\t");
            }
            System.out.println();
        }
    }
}
