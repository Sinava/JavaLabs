package Lab2;
import javax.swing.*;
import java.util.Scanner;
public class Switch {
    static public void main( String args[]){
        String answer = JOptionPane.showInputDialog(null,
                "Введите исходный бал",
                "Вычисление рейтинга", JOptionPane.OK_CANCEL_OPTION);
        int variant = Integer.parseInt(answer);
        variant/=10;
        switch (variant){
            case 1:
                System.out.print("Значение рейтинга - F" );
                break;
            case 2:
                System.out.print("Значение рейтинга - F" );
                break;
            case 3:
                System.out.print("Значение рейтинга - F" );
                break;
            case 4:
                System.out.print("Значение рейтинга - F" );
                break;
            case 5:
                System.out.print("Значение рейтинга - F" );
                break;
            case 6:
                System.out.print("Значение рейтинга - D" );
                break;
            case 7:
                System.out.print("Значение рейтинга - C" );
                break;
            case 8:
                System.out.print("Значение рейтинга - B" );
                break;
            case 9:
                System.out.print("Значение рейтинга - A" );
                break;
            case 10:
                System.out.print("Значение рейтинга - A" );
                break;
            default:
                System.out.println(("Неверный ввод!"));
        }
    }
}
