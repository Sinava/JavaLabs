package Lab2;
import java.util.Scanner;

public class While {
    static public void main (String args[]){
        int a,b,temp;
        int sum =0;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите месяц рождения: ");
        a=input.nextInt();
        System.out.println("Введите день рождения: ");
        b=input.nextInt();

        if(a>b){
            temp = a;
            a=b;
            b=temp;
        } else if (a==b) {
            b*=10;
        }

        while (a<=(b)){
            if(a%2!=0) {
                sum += a;
            }
            a++;
        }
        System.out.println("Сумма чисел равна: "+ sum);
    }
}
