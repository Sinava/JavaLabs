/*
 Задание
 Изучите и законспектируйте теорию:
 1. Методы и их перегрузка в java
 Повторите выполнение данного примера.
 Разберитесь в решаемой задаче.
 Самостоятельно:
 A. Самостоятельно рассмотреть варианты с обращением к методу max
 в случаях, когда
 1. обращение с двумя параметрами имеет различный порядок
 int и double типов, а также float.
 2. обращение с тремя параметрами имеет различный порядок
 int и double типов, а также float.
 3. при анализе определите какой из перегруженных методов
 выполняется.
 4. по аналогии напишите перегруженные методы для расчета
 минимального значения. Методы разместите в этом же классе.
 5. Возникают ли у вас Ambiguous Invocation.
 B. Создайте новый класс TestSqrt. Внутри класса напишите код метода,
 MySqrt, вычисляющего значения квадратного корня из целого числа.
Создайте все
 необходимые перегруженные методы для вычисления квадратного корня
 с другими типами данных.
 Оформите отчет с теорией и скриншотами ваших индивидуальных данных.
 В отчете представьте глоссарий из 5-10 новых терминов для данной темы.
 Контрольные вопросы (ответы также включить в отчет)
 1. Что такое перегрузка методов?
 2. Что такое сигнатура метода?
*/

package Lab3;

public class TestMethodOverloading {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Вызов метода max метода с двумя int параметрами
        System.out.println("The maximum between 3 and 4 is "
                + max(3, 4));
        // Вызов метода max с двумя double параметрами
        System.out.println("The maximum between 3.0 and 5." +
                + max(3.0, 5.4));
        // Вызов метода max с int и double параметрами
        System.out.println("The maximum between 3 and 5.4 is "
                + max(3, 5.4));
        // Вызов метода max с тремя! double параметрами
        System.out.println("The maximum between 3.0, 5.4, and 10.14 is "
                + max(3.0, 5.4, 10.14));
        // Вызов метода min метода с двумя int параметрами
        System.out.println("The minimum between 3 and 4 is "
                + min(3, 4));
        // Вызов метода min с двумя double параметрами
        System.out.println("The minimum between 3.0 and 5." +
                + min(3.0, 5.4));
        // Вызов метода min с int и double параметрами
        System.out.println("The minimum between 3 and 5.4 is "
                + min(3, 5.4));
        // Вызов метода min с тремя! double параметрами
        System.out.println("The minimum between 3.0, 5.4, and 10.14 is "
                + min(3.0, 5.4, 10.14));
    }
    /**
     * Возвращает max из двух int значений
     */
    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    /**
     * Возвращает max из двух double значений
     */
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static float max(float num1, float num2)
    {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    /**
     * Возвращает max из трех double значений
     * используется обращение к методу с двумя параметрами
     */
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
    /**
     * Возвращает min из двух double значений
     */
    public static double min(double num1, double num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }

    public static float min(float num1, float num2)
    {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
    /**
     * Возвращает min из трех double значений
     * используется обращение к методу с двумя параметрами
     */
    public static double min(double num1, double num2, double num3) {
        return min(min(num1, num2), num3);
    }
}
