/*
 Задание
 Изучите и законспектируйте теорию:
 1. Методы и их параметры в java
 Повторите выполнение данного примера.
 Разберитесь в решаемой задаче.
 Самостоятельно:
 Самостоятельно написать код swapFlag, меняюзего местами
 две переменные при передаче третьей перменной, инициализированной TRUE
 Контрольные вопросы (ответы также включить в отчет)
 1. Как передать данные в метод?
 2. Может ли метод возвращать несколько значений?
*/
package Lab3;

/**
 * другой пример передачи по значению
 * на примере метода swap
 *
 * @author V.V. Sidorik
 * @version 1.2 14.02.2017
 */
public class TestPassByValue {
    /** Main method */
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные
        int num1 = 1;
        int num2 = 2;
        boolean bool = true;
        System.out.println("Перед вызовом метода swap, num1 = " +
                num1 + " и num2 = " + num2);
        // Вызываем метод swap в попытке поменять местами две переменные
        swap(num1, num2);
        System.out.println("После вызова метода swap method, num1 = " +
                num1 + " и num2 = " + num2);
        swapFlag(num1, num2, bool);
        System.out.println("После вызова метода swapFlag, num1 = " +
                num1 + " и num2 = " + num2);
    }
    /** Swap two variables */
    public static void swap(int n1, int n2) {
        System.out.println("\tВнутри метода swap");
        System.out.println("\t\tПеред перестановкой n1 = " + n1
                + " n2 = " + n2);
        // Swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("\t\tПосле перестановки n1 = " + n1
                + " n2 = " + n2);
    }
    //Swap two variables if flag==true
    public static void swapFlag(int n1, int n2, boolean flag) {
        if(!flag){
            System.out.println("Значение флага - false");
        }
        else {
            System.out.println("\tВнутри метода swapFlag");
            System.out.println("\t\tПеред перестановкой n1 = " + n1
                    + " n2 = " + n2);
            // Swap n1 with n2
            int temp = n1;
            n1 = n2;
            n2 = temp;
            System.out.println("\t\tПосле перестановки n1 = " + n1
                    + " n2 = " + n2);
        }
    }
}
