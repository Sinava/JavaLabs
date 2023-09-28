package Lab2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Rating {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Введите исходный балл: ");

        int a = input.nextInt();

        if (a<0 || a>100){
            System.out.println("Ввод недопустимых значений");
        }


        if(a>=90)
            System.out.println("Рейтинг равен A");
        else if (a>=80 && a<90) {
            System.out.println("Рейтинг равен B");
        } else if (a>=70 && a<80) {
            System.out.println("Рейтинг равен C");
        } else if (a>=60 && a <70) {
            System.out.println("Рейтинг равен D");
        } else  {
            System.out.println("Рейтинг равен F");
        }
    }
}
