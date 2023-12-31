/*
 Задание
 Изучите и законспектируйте теорию:
 1. if - оператор.
 Повторите выполнение данного примера.
 Разберитесь в решаемой задаче.
 Выведите x, y на печать.
 Самостоятельно:
 Написать код для вычисления рейтинга по шкале:
 A >= 90 баллов, 80<=B<90, 70<=C<80, 60<=D<70.
 В других случаях - D.
 Исходный балл задается в интервале целых от 0 до 100.
 Рейтинг представляется в символьной шкале A, B, C, D, F.
 Данные в баллах вводить с консоли. Результат вывести на печать.
 Используйте конструкцию if ... else if ... else if ... else
 Код оформить в виде отдельного класса Rating
 Оформите отчет с теорией и скриншотами ваших индивидуальных данных.
 В отчете представьте глоссарий из 5-10 новых терминов для данной темы.
 Контрольные вопросы (ответы также включить в отчет)
 1. В каких случаях используется if оператор?
*/

package Lab2;
import java.util.Scanner;
/**
 * Ввод данных с консоли с использованием Scanner.
 * Конструкции для
 * operator if
 * - one-way
 * - two-way
 * - nested
 *
 * @author V.V. Sidorik
 * @version 1.2 09.02.2017
 */
public class ifTestSmall {
    public static void main(String args[]) {
        // создаём экземпляр класса Scanner для ввода
        Scanner input = new Scanner(System.in);
        // подсказка вводить x
        System.out.println("Введите целое значение х");
        int x = input.nextInt();
        // подсказка вводить у
        System.out.println("Введите целое значение y");
        int y = input.nextInt();
        // Вариант 1: one-way
        if (x > y)
            System.out.println("x больше y");
        // Вариант 2: one-way
        // если операторов несколько используем скобки
        if (x > y) {System.out.println("x больше y");
            System.out.println("Разность x - y = " + (x - y));
        }
        // Вариант 3: two-way
        if (x > y) {
            System.out.println("x больше y");
            System.out.println("Разность x - y = " + (x - y));
        } else {
            System.out.println("x меньше или равно y");
        }
    }
}
