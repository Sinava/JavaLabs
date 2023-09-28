/*
 Задание
 Изучите и законспектируйте теорию:
 1. Класс Math и его использование.
 Повторите выполнение данного примера.
 Разберитесь в решаемой задаче и опишите ее условие в комментарии к
классу.


 Самостоятельно:
 Вычислить корни квадратного уравнения х1 и х2.
 Параметры a, b, c - задать вводом с консоли.
 a, b, c и корни вывести на печать.
 Формула для расчета стандартная.
 Программу оформите в виде отдельного класса.
 Оформите отчет с теорией и скриншотами ваших индивидуальных данных.
 В отчете представьте глоссарий из 5-10 новых терминов для данной темы.
 Контрольные вопросы (ответы также включить в отчет)
 1. Почему мы в данном случае не импортируем класс Math?
*/
package Lab2;

/**
 * Вычисление арифметических выражений
 * с использованием класса Math
 * пример выражения
 * y = a*a * sin(x) - b *exp(-a)
 *
 * @author V.V. Sidorik
 * @version 1.2
 */
public class MathClassExample {
    public static void main(String[] args) {
        int a = 3;
        double b = 34.789;
        double x = 12.3;
        double y = Math.pow(a, 2) * Math.sin(x) - b * Math.exp(-a);
        y = Math.sqrt(Math.abs(y));
        System.out.println("y = " + y);
    }
}