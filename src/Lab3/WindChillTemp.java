/*
Задание
Напишите код для расчет эффективной температуры воздуха в зависимости от
температуры, скорости ветра и влажности. Для расчета используйте данные по
ссылке или из других интернет источников.
https://ggf.tsu.ru/content/faculty/structure/chair/meteorology/publications/%D0%
9A%D0%BB%D0%B8%D0%BC%D0%B0%D1%82%D0%BE%D0%BB%D0%BE%D0%B3%D0%B8%D1%8F/text/149.ht
ml
*/

package Lab3;
import java.util.Scanner;
/*
Класс для вычисления эффективной температоры
 */
public class WindChillTemp {
    public static void main(String[] args) {
        double t, v, e;
        Scanner input = new Scanner(System.in);
        System.out.println("Input tempreture ");
        t = input.nextDouble();
        System.out.println("Input wind speed ");
        v = input.nextDouble();
        System.out.println("Input chill ");
        e = input.nextDouble();
        System.out.println("Effective temperature is " + effectiveTemp(t,v,e)+" °C");
    }

    /**
     * Метод вычисления Эффективной Температуры ощущаемя человеком 
     */
    public static double effectiveTemp(double t,double v,double e){
        return -2.7 + 1.04 * t + 2.0 * (0.611 * e) - 0.65 * v;
    }
}
