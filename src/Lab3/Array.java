/*
        Задание
        Изучите и законспектируйте теорию:
        1. Массивы в java
        Повторите выполнение данного примера.
        Разберитесь в решаемой задаче.
        Самостоятельно:
        Самостоятельно задать массив из от 10 до 30 элементов и инициализировать
        Написать метод сортировки массива по возрастанию (убыванию)
        Написать javadoc комментарий к методу
        Контрольные вопросы (ответы также включить в отчет)
        1. Как объявляются массивы?
        2. Какие существуют варианты объявления массивов?
        */
package Lab3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * демонстрация массивов
 *
 * @author V.V. Sidorik
 * @version 1.2 14.02.2017
 */
public class Array {
    public static void main(String[] args) {
        int[] numbers;
        char[] letters, symbols;
        long bigNumbers[];
        String[] countries;
        numbers = new int[3];
        String[] currencies = new String[3];
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        int[] newNumbers = {1, 2, 3};



        //Трассировка метода
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4); // returns 1
        int j = linearSearch(list, -4); // returns -1
        int k = linearSearch(list, -3); // returns 5
        System.out.println(i + " " + j + " " + k);

        //Сортировка массива
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = input.nextInt();
        int[] array = randArray(n);
        System.out.println("Отсортированный массив: "+ Arrays.toString((shellSort(array))));
        System.out.println("Отсортированный массив по убыванию: "+ Arrays.toString((revshellSort(array))));
    }
    /**
     * метод поиска key в списке
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++)
            if (key == list[i])
                return i;
        return -1;
    }

    /**
     * метод создания массива заполненного случайными числами
     */
    public static int[] randArray (int n){

        Random random = new Random();
        int[] array = new int[n];
        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    /**
     * Метод сортировки массива Шелла
     */
    public static int[] shellSort(int[] list){
        int n = list.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = list[i];
                int j = i;
                while (j >= gap && list[j - gap] > key) {
                    list[j] = list[j - gap];
                    j -= gap;
                }
                list[j] = key;
            }
        }
        return list;
    }
    public static int[] revshellSort(int[] list){
        int n = list.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = list[i];
                int j = i;
                while (j >= gap && list[j - gap] < key) {
                    list[j] = list[j - gap];
                    j -= gap;
                }
                list[j] = key;
            }
        }
        return list;
    }

}
