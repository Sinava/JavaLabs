/*
 Задание
 Изучите и законспектируйте теорию:
 1. Перегрузка методов.
 Повторите выполнение данного примера.
 Разберитесь в решаемой задаче.
 Самостоятельно:
 Задание 1. Написать метод getRandomCharacter(перегруженный), генерирующий
 целые числа в заданном интервале. Протестировать метод.
 Написать метод getRandomCharacter(перегруженный), генерирующий числа
 с двойной точностью в заданном интервале. Протестировать метод.
 Написать javadoc комментарий к методам.

 Задание 2. Написать код метода, осуществляюшего линейный поиск
 заданного элемента (числа) в массиве. Массив задать как целый в интервале
 целых чисел от 0 до 100. Размерность массива 50 (или на ваше
 усмотрение). Выполнить тестирование метода.
 Написать javadoc комментарий к методу.
 Контрольные вопросы (ответы также включить в отчет)
 1. Что такое сигнатура метода?
 2. Чем отличаются перегруженные методы?
*/

package Lab4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * генерируем случайным образом числа
 * в интервале [0, 1)
 * а также символы в интервале от char1 до char2,
 * целых чисел в интервале от val1 до val2
 * с помощью соответствующих методов
 *
 * генерируем случайные целые числа от in1 до in2
 * генерируем случайные числа с двойнойной точностью от num1 до num2
 *
 * метод заполнения массива случайными числами заданной размерностью
 * метод линейного поиска числа в массиве
 *
 * @authors Sidorik V.V. & Guysin V.S.
 * @version 1.4 27.09.2023
 */
public class RandomCharacter {
    public static void main (String[] args){
        System.out.println(Math.random());
        System.out.println(getRandomCharacter('f', 'h'));
        System.out.println(getRandomCharacter('A', 'Z'));
        System.out.println(getRandomLowerCaseLetter());
        System.out.println(getRandomDigitCharacter());
        System.out.println(getRandomCharacter());

        System.out.println(getRandomCharacter(3, 90));
        System.out.println(getRandomCharacter(4.2, 6.12));

        System.out.println("Введите размер массива");
        Scanner inpt = new Scanner(System.in);
        int n = inpt.nextInt();

        int[] array = randArray(n);
        System.out.println("Полученный массив размерностью " + n + ":\n" + Arrays.toString(array));

        System.out.println("Введите число для поиска в массиве");
        int key = inpt.nextInt();

        if (linearSearch(array, key)!=-1)
            System.out.println("Число находится в массиве с индексом " + linearSearch(array, key));
        else
            System.out.println("Данного числа нет в массиве");

    }
    /**
     * генерируем случайным образом символы между ch1 и ch2
     */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }


    /**
     * генерируем случайным образом целые числа между in1 и in2
     */
    public static int getRandomCharacter(int in1, int in2) {
        return (int) (in1 + Math.random() * (in2-in1 + 1));
    }
    /**
     * генерируем случайным образом числа с двойной точностью между num1 и num2
     */
    public static double getRandomCharacter(double num1, double num2){
        return (num1 + Math.random()* (num2-num1+1));
    }

    /**
     * генерируем случайные lowercase letter
     */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    /**
     * генерируем случайные uppercase letter
     */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    /**
     * генерируем случайные digit character
     */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    /**
     * генерируем случайные character
     */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }


    /**
     * метод создания массива заполненного случайными числами
     */
    public static int[] randArray (int n){
        int[] array = new int[n];
        for (int i=0; i<array.length; i++) {
            array[i] = getRandomCharacter(0,100);
        }
        return array;
    }

    /**
     * метод линейного поиска числа в массиве
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++)
            if (key == list[i])
                return i;
        return -1;
    }
}
