package Lab2;
import java.util.Scanner;

public class DoWhile {
    static public void main (String args[]){
        int a;
        int sum=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Введите ваше число");
            a= input.nextInt();
            if(!(a==12||a==2))
                sum+=a;
        }
        while (a!=0);
        System.out.print("Сумма чисел равна: "+sum);

    }
}
