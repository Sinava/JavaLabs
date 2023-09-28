package Lab2;

public class ForLoop {
    static public void main (String args[]){
        int x=0;
        int y=0;

        for(int i=0; i<101; i++){
            if(i%14==0){
                x+=i;
            }
        }
        System.out.println("Сумма чисел диапазоне от 0 до 100 равна: "+ x);
        for (int i=200; i<501; i++){
            if (i%14==0){
                y+=i;
            }
        }
        System.out.println("Сумма чисел диапазоне от 200 до 500 равна: "+ y);
        System.out.print("Сумма чисел: "+(x+y));
    }
}
