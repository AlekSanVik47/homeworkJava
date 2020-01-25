package lesson1;

import java.util.Arrays;

public class Homework1Task5 {
    public static void main(String[] args) {

        negativOrPositiv(0);
        negativOrPositiv(-15);
        negativOrPositiv(75);

    }
    private static void negativOrPositiv (int numeral) {
        if (numeral >= 0) {
            System.out.println(numeral +  "   positive number");
        } else {
            System.out.println(numeral + "   negative number");
        }
    }
}
