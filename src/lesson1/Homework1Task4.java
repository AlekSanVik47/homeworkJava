package lesson1;


public class Homework1Task4 {

    public static void main(String[] args) {
        int a;
        int b;
        System.out.println(test(a = 5, b = 4));
        System.out.println(test(a = 5, b = 5));
        System.out.println(test(a = 5, b = 14));
        System.out.println(test(a = 5, b = 15));
        System.out.println(test(a = 5, b = 16));
    }
    private static boolean test(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
