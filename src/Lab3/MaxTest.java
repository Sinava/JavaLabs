/*
 Задание
 Изучите и законспектируйте теорию:
 1. Методы, возвращающие и не возвращающие значения в java
 Повторите выполнение данного примера.
 Разберитесь в решаемой задаче.
 Самостоятельно:
 Написать код метода, находящего наименьшее значение
 из двух целых чисел и печатающего его, но не возвращающего.
 Метод разместить в этом же классе.
 Написать обращение к методу и протестировать его.
 Напишите код ввода данных с использованием консоли.
 Оформите отчет с теорией и скриншотами ваших индивидуальных данных.
 В отчете представьте глоссарий из 5-10 новых терминов для данной темы.
 Контрольные вопросы (ответы также включить в отчет)
 1. Какой оператор используется для возвращения значения из метода и его
сиинтаксис?
 2. В чем отличия объявления методов, возвращающих и не возвращающих
значения?
*/

package Lab3;
import java.util.Scanner;
/**
 * пример метода возвращающего значение
 * метод max возвращает значение целое
 * тип возвращаемого значения перед именем метода
 * вместо void
 *
 * @author V.V. Sidorik
 * @version 1.2 14.02.2017
 */
public class MaxTest {
    /** Main method */
    public static void main(String[] args) {
        int i,j;
        Scanner inpt = new Scanner(System.in);
        System.out.println("Input the first number: ");
        i=inpt.nextInt();
        System.out.println("Input the second number: ");
        j=inpt.nextInt();
        // call method max
        int k = max(i, j);
        System.out.println("The maximum between " + i +
                " and " + j + " is " + k);
        //call method min
        min(i, j);
    }
    /** Return the max between two numbers */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
/** Print the min between two numbers*/
    public static void min(int num1, int num2){
        if(num1 < num2)
            System.out.println("The minimum number is " + num1);
        else
            System.out.println("The minimum number is " + num2);
    }
}
