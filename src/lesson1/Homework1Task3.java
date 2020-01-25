package lesson1;


public class Homework1Task3 {
// если вывожу в формате a: 5, выпадает ошибка
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float d;
        float result = valuesCalc(a = 2.55f,b = 33.77f,c = 10f,d = 25.25f);
        System.out.println(result);
    }

    private static float valuesCalc(float a, float b, float c, float d) {
        if (d == 0) {
            return 0;
        }
        return a * (b + (c / d));
    }
}
