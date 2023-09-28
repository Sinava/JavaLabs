package Lab3;
import java.util.Scanner;

public class TestSqrt {
    /**
     * Main method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input int number ");
        int a = input.nextInt();
        System.out.println("Input double number ");
        double b = input.nextDouble();
        System.out.println("Input float number ");
        float c = input.nextFloat();
        System.out.println("sqrt by int number "+ MySqrt(a));
        System.out.println("sqrt by double number " + MySqrt(b));
        System.out.println("sqrt by float number " + MySqrt(c));
    }

    /**
     * Finding sqrt
     */
    public static int MySqrt(int a){
        double b = a;
        return (int) Math.sqrt(b);
    }
    public static double MySqrt(double a){
        return Math.sqrt(a);

    }
    public static float MySqrt(float a){
        return (float) Math.sqrt(a);
    }
}
