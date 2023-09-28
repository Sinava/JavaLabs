package Lab2;
import java.util.Scanner;

public class MathClass {
    static public void main(String args[]){
        double a,b,c;
        double D;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите переменную a");
        a=input.nextDouble();
        System.out.println("Введите переменную b");
        b=input.nextDouble();
        System.out.println("Введите переменную c");
        c=input.nextDouble();
        D=Math.pow(b,2)-4*a*c;
        System.out.println("Дискриминант: "+ D);
        if(D>0){
            double x1,x2;
            x1=(-b-Math.sqrt(D)) / (2 * a);
            x2=(-b+Math.sqrt(D)) / (2 * a);
            System.out.println("При a= "+ a + ", b= "+ b +", c= "+ c +
                    "\nкорни уравнения: x1= "+ x1 + ", x2= "+x2);
        }else if(D==0){
            double x;
            x= -b/(2*a);
            System.out.println("При a= "+ a + ", b= "+ b +", c= "+ c +
                    "\nкорень уравнения: x= "+x);
        }else {
            System.out.println("При a= "+ a + ", b= "+ b +", c= "+ c +
                    "\nyравнение не имеет корней!");
        }

    }
}
