package lesson2;

import java.util.Arrays;

public class Homework2Task3 {

    public static void main(String[] args) {
        changeArray();
    }

    public static void changeArray() {
        int[] w = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < w.length; ++i) {
            if (w[i] < 6) {
                w[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(w));
    }
}
