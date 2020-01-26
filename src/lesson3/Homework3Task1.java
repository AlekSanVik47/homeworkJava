package lesson3;


import java.util.Random;
import java.util.Scanner;

public class Homework3Task1 {
    public static void main(String[] args) {
        getRandomNamber();
    }

    public static void getRandomNamber() {

        Random rand = new Random();
        int x = rand.nextInt(9);

        System.out.println(" Угадайте  случайное число 0 до 9-ти\n у Вас 3 попытки:  ");

        for (int i = 0; i <= 2; ++i) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (x == a) {
                System.out.println("Поздравляем, Вы угадали!");
                return;
            }


            if (a > x && i < 2) {
                System.out.println("Вы ввели число  больше");

                    System.out.println("Введите число еще раз:  ");
            }
                if (a < x && i < 2) {
                    System.out.println("Вы ввели число меньше");

                    System.out.println("Введите число еще раз:  ");
                }

                if (i == 2 && a != x) {
                    System.out.println(" Повторить игру еще раз? \n 1 – да / 0 – нет :  ");
                    int b = sc.nextInt();
                    if (b == 1) {
                        Homework3Task1.getRandomNamber();
                    } else {
                        break;
                    }
                }

            }
        }

    }


