package lesson1;


public class Homework1Task6 {
    public static void main(String[] args) {
        System.out.println(showInteger(0));
        System.out.println(showInteger(-100));
        System.out.println(showInteger(22));

    }
    private static boolean showInteger(int integer) {

        return integer < 0;
    }
}
