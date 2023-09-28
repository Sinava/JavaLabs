/*
 Задание
 Изучите и законспектируйте теорию:
 1. do-while оператор.
 Повторите выполнение данного примера.
 Разберитесь в решаемой задаче.
 Введите индивидуальные значения для завершения цикла и повторите
вычисления.
 Самостоятельно:
 Используя оператор do...while напишите код
 вычисления суммы целых чисел, вводимых с консоли.
 Если число соответствует дню или месяцу вашего рождения - суммирование
не проводится.
 Код оформить в виде отдельного класса.
 Оформите отчет с теорией и скриншотами ваших индивидуальных данных.
 В отчете представьте глоссарий из 5-10 новых терминов для данной темы.
 Контрольные вопросы (ответы также включить в отчет)
 1. В каких случаях используется do-while оператор?
 2. Что означает data != 0 в коде программы при выполнени?
*/

package Lab2;
import java.util.Scanner;
/**
 * Вычисление суммы чисел.
 * do-while цикл.
 *
 * @author V.V. Sidorik
 * @version 1.2 09.02.2017
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int data;
        int sum = 0;
        // Создаем объект Scanner
        Scanner input = new Scanner(System.in);
        // Вводим данные пока не 0
        // Keep reading data until the input is 0
        do {
            // Read the next data
            System.out.println("Вводите целое значение (выход, если 0): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("Сумма введенных чисел = " + sum);
    }
}
