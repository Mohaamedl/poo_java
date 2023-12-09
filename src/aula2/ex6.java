package aula2;
import java.util.Scanner;
public class ex6 { //passagem de segundos a  horas, minutos e segundos
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long S = input.nextLong(),s,m,h;
        s=S%60;
        m= (S/60)%60;
        h= (S/60)/60;
        input.close();
        System.out.format("A conversão é %d horas %d minutos e %d segundos",h,m,s );
    }
    
}
