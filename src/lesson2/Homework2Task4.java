package lesson2;

import java.util.Arrays;

public class Homework2Task4 {

    public static void main(String[] args) {
        fillDiagonal();
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];

        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                if (i == j || 4 - i == j + 1) {
                    arr[i][j] = 1;
                }

            }

            System.out.println(Arrays.toString(arr[i]));
        }

    }
}