/*
 Задание
 Изучите и законспектируйте теорию:
 1. Передача данных с помощью массивов в метод
 Повторите выполнение данного примера.
 Разберитесь в решаемой задаче.
 Самостоятельно:
 Решить квадратное уравнение вида a*x*x+b*x-c=0
 Решение оформить в виде класса.
 Параметры уравнения a, b, c вводить с консоли.
 Для решения создать метод.
 Для корней использовать массив.
 Корни вывести на консоль.
 Написать javadoc комментарий к методу, классу
 Контрольные вопросы (ответы также включить в отчет)
 1. Какие варианты существуют для объявления массивов? Инициализации?
 Приведите примеры.
 2. Как осуществляется передача данных с использованием массивов?
 2. В чем отличие передачи данных по ссылке и по значению?
*/

package Lab4;

/**
 * два примера использования массивов для
 * передачи данных в метод и обратно
 * пример 1: обмен местами элементов массива
 * пример 2; решение квадратного уравнения
 *
 * @author Sidorik V.V.
 * @version 1.2 01.03.2017
 */
public class ArrayExampleSwap {
    public static void main (String[] args){
        //пример 1: обмен местами элементов массива
        //объявляем и конструируем var
        int[] var = new int[4];

        //инициализируем массив var
        var[0]=3;
        var[1]= -7;
        var[2]= 9;
        var[3]= 18;
        System.out.println("Элементы массива до обмена: " +
                "\n\t var[1] = " + var[1] +
                "\n\t var[2] = " + var[2]);

        swap(var,1,2);
        System.out.println("Элементы массива после обмена: " +
                "\n\t var[1] = " + var[1] +
                "\n\t var[2] = " + var[2]);
    }

    //меняет местами элементы массива arr[i] и arr[j]
    private static void swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}