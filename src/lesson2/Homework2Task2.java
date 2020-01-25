package lesson2;

import java.util.Arrays;

public class Homework2Task2 {

    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int[] arr = new int[8];
        arr[0] = 0;

        for(int i = 0; i < arr.length; ++i)
            arr[i] = i * 3;
        System.out.println(Arrays.toString(arr));
    }
}

