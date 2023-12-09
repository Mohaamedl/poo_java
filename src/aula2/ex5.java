package aula2;
import java.util.Scanner;
public class ex5 { //velocidade media
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza: 1ª distancia, 1ª velocidade, 2ª distancia, 2ª velocidade e unidade nesta ordem");
        Double d1 = input.nextDouble(), v1 = input.nextDouble(),
        d2 = input.nextDouble(), v2 = input.nextDouble(),vm;
        String u = input.next();
        input.close();
        vm = (d1*d2*(d1+d2))/(v1*d2+v2*d1);
        System.out.format("A velocidade média é %.2f %s",vm,u);
        
    }
    
}
