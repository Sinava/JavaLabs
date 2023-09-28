package Lab2;

public class Breake {
    static public void main(String args[]){
        long prov=14;
        int a=15;

        while(a <= 2017) {
            prov*=a;
            if(prov%79==0){
                break;
            }
            System.out.println(prov);
            a++;
        }
         System.out.print("Произведение чисел равно: "+prov);
    }
}
