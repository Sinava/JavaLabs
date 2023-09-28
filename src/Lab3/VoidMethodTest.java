/*
 Задание
 Изучите и законспектируйте теорию:
 1. Методы, не возвращающие значения в java
 Повторите выполнение данного примера.
 Разберитесь в решаемой задаче.
 Самостоятельно:
 Написать код метода, printGrade, печатающего рейтинг
 в соответствии с символьной шкалой A, B, C, D, F.
 Код разместить в методе printGrade.
 Протестировать код с различными данными.
 Напишите код ввода данных с использованием консоли

 Контрольные вопросы (ответы также включить в отчет)
 1. Какое ключевое слово в объявлении отличает методы,
 возвращающие и не возвращающие значения?
 2. Может ли метод возвращать несколько значений?
*/

package Lab3;
import java.util.Scanner;
/**
 * пример метода void (не возвращающего значение)
 * это не метод main !!!
 * метод просто печатает рейтинг по набранному баллу
 *
 * @author V.V. Sidorik
 * @version 1.2 14.02.2017
 */
public class VoidMethodTest {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(92.5);
        System.out.print("The grade is ");
        printGrade(54.5);

        System.out.print("Input your score ");
        Scanner inpt = new Scanner(System.in);
        double a = inpt.nextDouble();
        System.out.print("The grade is ");
        printGrade(a);
    }
    //outputs the grade based on score
    public static void printGrade(double score) {
        // здесь должен быть ваш код в соответствии с заданием
        if (score<0 || score>100){
            System.out.println("Incorrect input");
        }
        if(score>=90)
            System.out.println("A");
        else if (score>=80 && score<90) {
            System.out.println("B");
        } else if (score>=70 && score<80) {
            System.out.println("C");
        } else if (score>=60 && score <70) {
            System.out.println("D");
        } else  {
            System.out.println("F");
        }
    }
}
