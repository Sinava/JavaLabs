package Lab4;
import java.util.Scanner;

/**
 * Нахождение корней из квадратного уравнения
 * a*x*x+b*x-c=0
 *
 *
 * @author V.S. Guysin
 * @version 1.1 25.09.2023
 */
public class QuadricEqualetion {
    static public void main (String[] args){
        double [] root = new double [2];
        double a,b,c;
        Scanner inpt = new Scanner(System.in);

        a = inpt.nextFloat();

        b = inpt.nextFloat();

        c = inpt.nextFloat();

        roots(root, a, b, c);

        System.out.println("Корни квадратного уравнения a*x*x+b*x-c :" +
                "x1= " + root[0] +
                "x2= " + root[1]);
    }

    //Находит дискриминант уравнение, находит корни уравнения и заносит их в массив
    public static void roots (double[] array, double a, double b , double c){
        double D=Math.pow(b,2)-4*a*c;
        System.out.println("Дискриминант: "+ D);
        if(D>0){
            array[0]=(-b-Math.sqrt(D)) / (2 * a);
            array[1]=(-b+Math.sqrt(D)) / (2 * a);

        }else if(D==0){
            array[0]= -b/(2*a);

        }else {
            System.out.println("При a= "+ a + ", b= "+ b +", c= "+ c +
                    "\nyравнение не имеет корней!");
        }
    }
}
